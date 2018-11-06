/*
 * A través de esta clase nos interesa gestionar la ejecución de nuestra
 * creación
 */
package animations;

import LogicalEngine.Circunferencia;
import Utilities.alternador;

/**
 *
 * @author Duverney Hernandez Mora
 */
public class AnimCircunferencia extends Thread {

    public Circunferencia circuns;
    long frecuencia;
    alternador alterna;
    boolean sentido = false;

    /**
     *
     * @param a Coordenada en el eje x del punto centro de la circunferencia
     * @param b Coordenada en el eje y del punto centro de la circunferencia
     * @param r Radio de la circunferencia
     * @param frecuencia Frecuencia del hilo
     */
    public AnimCircunferencia(float a, float b, float r, long frecuencia, int incremento, boolean sentido) {
        this.circuns = new Circunferencia(a, b, r);
        this.frecuencia = frecuencia;
        this.alterna = new alternador((int) r, (int) -r, incremento, (int) -r);
        this.sentido = sentido;
    }

    @Override
    public void run() {
        while (true) {
            try {
                this.alterna.alterar();
                this.circuns.setX(alterna.getContador());
                // Al iterar se halla el valor para Y, pero además, se le indica el sentido del giro a través del parámetro
                if (sentido) {
                    this.circuns.CambiaX(alterna.isAlterna());
                } else {
                    this.circuns.CambiaX(!alterna.isAlterna());
                }

                sleep(frecuencia);
            } catch (InterruptedException e) {
            }
        }
    }

    public Circunferencia getCircuns() {
        return circuns;
    }

    public long getFrecuencia() {
        return frecuencia;
    }

    public alternador getAlterna() {
        return alterna;
    }

    public void setCircuns(Circunferencia circuns) {
        this.circuns = circuns;
    }

    public void setFrecuencia(long frecuencia) {
        this.frecuencia = frecuencia;
    }

    public void setAlterna(alternador alterna) {
        this.alterna = alterna;
    }

}
