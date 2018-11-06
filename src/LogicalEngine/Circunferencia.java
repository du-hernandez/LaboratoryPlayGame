/*
 * En esta oportunidad haremos uso de la ecuación de la circunferencia
 * con el objetivo de representar un punto sobre la misma.
 */
package LogicalEngine;

import java.awt.Graphics;
import assets.ImageCollection;

/**
 *
 * @author Duverney Hernandez Mora
 */
public class Circunferencia {

    private ImageCollection colection = new ImageCollection();
    
    /**
     * @see Ecuación de la circunferencia
     * @see (x - a)^2 + (y - b)^2 = r^2
     */
    private float a = 0, b = 0, r, x = 0, y = -25;
    /**
     * @see Ecuación de la circunferencia
     * @see (x - a)^2 + (y - b)^2 = r^2
     */
    
    /**
     * @param a Coordenada en el eje x del punto centro de la circunferencia
     * @param b Coordenada en el eje y del punto centro de la circunferencia
     * @param r Radio de la circunferencia
     */
    public Circunferencia(float a, float b, float r) {
        this.a = a;
        this.b = b;
        this.r = r;
    }

    /**
     *
     * @param r Radio de la circunferencia
     */
    public Circunferencia(float r) {
        this.r = r;
    }

    /**
     * A continuación nos ocuparemos de calcular el valor de la coordenada 'y'
     * cuando cambia la coordenada x, es decir, cuando conocemos el valor de x
     *
     * @exception x debe ser menor o igual al valor del radio
     * @see this.setX(float x)
     * @param sentido Determina si el movimiento es negativo (false) o positivo (true) (provisional a causa del plano de coordenadas invertido)
     *                Con esta estrategia consegimos que el giro sea de 369°
     */
    public void CambiaX(boolean sentido) {
        /**
         * ((y - b)^2)^(1/2) = (r^2 - (x - a)^2)^(1/2)
         * luego
         * y = (r^2 - (x - a)^2)^(1/2) + b
         * entonces:
         * Conociendo el centro de la circunferencia (a y b),
         * entonces, bastaría con hallar x^2 + y^2 = r^2, luego
         * sumarle a 'x' y 'y', los valores de 'a' y 'b' respectivamente
         */
        if (sentido) {
            this.y = (float)(Math.sqrt(Math.pow(this.getR(), 2) - Math.pow(this.getX(), 2)));
        } else {
            this.y = (float)(Math.sqrt(Math.pow(this.getR(), 2) - Math.pow(this.getX(), 2))) * -1;
        }
        //this.setY((float) (Math.sqrt(Math.pow(this.getR(), 2) - Math.pow(this.getX() - this.getA(), 2))) + getB());
    }

    /**
     * A continuación nos ocuparemos de calcular el valor de la coordenada x
     * cuando cambia la coordenada y, es decir, cuando conocemos el valor de y
     *
     * @exception y debe ser menor o igual al valor del radio
     * @see this.setY(float y)
     * @param sentido Determina si el movimiento es negativo (false) o positivo (true) (provisional a causa del plano de coordenadas invertido)
     *                Con esta estrategia consegimos que el giro sea de 369°
     */
    public void CambiaY(boolean sentido) {
        /**
         * ((x - a)^2)^(1/2) = (r^2 - (y - b)^2)^(1/2)
         * luego
         * x = (r^2 - (y - b)^2)^(1/2) + a
         * entonces:
         * Conociendo el centro de la circunferencia (a y b),
         * entonces, bastaría con hallar x^2 + y^2 = r^2, luego
         * sumarle a 'x' y 'y', los valores de 'a' y 'b' respectivamente
         */
        if (sentido) {
            this.x = (float)(Math.sqrt(Math.pow(this.getR(), 2) - Math.pow(this.getY(), 2)));
        } else {
            this.x = (float)(Math.sqrt(Math.pow(this.getR(), 2) - Math.pow(this.getY(), 2))) * -1;
        }
        this.x = (float)(Math.sqrt(Math.pow(this.getR(), 2) - Math.pow(this.getY(), 2)));
        //this.setX((float) (Math.sqrt(Math.pow(this.getR(), 2) - Math.pow(this.getY() - this.getB(), 2))) + getA());
    }
    
    /**
     * Conociendo el centro de la circunferencia (a y b),
     * entonces, bastaría con hallar x^2 + y^2 = r^2, luego
     * sumarle a 'x' y 'y', los valores de 'a' y 'b' respectivamente.
     * 
     * @param g Graphics object
     * @return Graphics object
     */
    public Graphics paintPoint(Graphics g) {
        //g.drawLine((int) (this.getA()), (int) (this.getB()), (int) (this.getX()) + (int) (this.getA()), (int) (this.getY()) + (int) (this.getB()));
        g.drawImage(colection.ImageCollection[2], (int) (this.getX()) + (int) (this.getA()), (int) (this.getY()) + (int) (this.getB()), null);
        return g;
    }

    public float getA() {
        return a;
    }
    public void setA(float a) {
        this.a = a;
    }
    public float getB() {
        return b;
    }
    public void setB(float b) {
        this.b = b;
    }
    public float getR() {
        return r;
    }
    public void setR(float r) {
        this.r = r;
    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
}
