/*
 * En esta clase nos ocuparemos de construir un contador que vaya hasta un
 * límite superior y luego hasta un límite inferior
 */
package Utilities;

/**
 *
 * @author Duverney Hernandez Mora
 */
public class alternador {

    int limSuperior, limInferior, incremento, contador;
    boolean alterna = true; // true = crece, false = decrece

    /**
     *
     * @param limSuperior Límite superior
     * @param limInferior Límite inferior
     * @param incremento Incremento
     * @param inicio Valor inicial del contador
     */
    public alternador(int limSuperior, int limInferior, int incremento, int inicio) {
        this.limInferior = limInferior;
        this.limSuperior = limSuperior;
        this.incremento = incremento;
        this.contador = inicio;
    }

    public void alterar() {
        if (alterna) {
            if (contador < limSuperior) {
                contador += incremento;
            } else {
                alterna = !alterna;
            }
        } else {
            if (contador > limInferior) {
                contador -= incremento;
            } else {
                alterna = !alterna;
            }
        }
    }

    public int getLimSuperior() {
        return limSuperior;
    }

    public int getLimInferior() {
        return limInferior;
    }

    public int getIncremento() {
        return incremento;
    }

    public int getContador() {
        return contador;
    }

    public boolean isAlterna() {
        return alterna;
    }

    public void setLimSuperior(int limSuperior) {
        this.limSuperior = limSuperior;
    }

    public void setLimInferior(int limInferior) {
        this.limInferior = limInferior;
    }

    public void setIncremento(int incremento) {
        this.incremento = incremento;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void setAlterna(boolean alterna) {
        this.alterna = alterna;
    }
}
