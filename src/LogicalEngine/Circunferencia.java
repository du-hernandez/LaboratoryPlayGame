/*
 * En esta oportunidad haremos uso de la ecuación de la circunferencia
 * con el objetivo de representar un punto sobre la misma.
 */
package LogicalEngine;

/**
 *
 * @author Duverney Hernandez Mora
 */
public class Circunferencia {

    /**
     * @see Ecuación de la circunferencia
     * @see (x - a)^2 + (y - b)^2 = r^2
     */
    private float a = 0;
    /**
     * @see Ecuación de la circunferencia
     * @see (x - a)^2 + (y - b)^2 = r^2
     */
    private float b = 0;
    /**
     * @see Ecuación de la circunferencia
     * @see (x - a)^2 + (y - b)^2 = r^2
     */
    private float r;
    /**
     * @see Ecuación de la circunferencia
     * @see (x - a)^2 + (y - b)^2 = r^2
     */
    private float x = 0;
    /**
     * @see Ecuación de la circunferencia
     * @see (x - a)^2 + (y - b)^2 = r^2
     */
    private float y = 0;

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
     */
    public void CambiaX() {
        /**
         * ((y - b)^2)^(1/2) = (r^2 - (x - a)^2)^(1/2)
         * luego
         * y = (r^2 - (x - a)^2)^(1/2) + b
         * entonces:
         */
        this.setY((float) (Math.sqrt(Math.pow(this.getR(), 2) - Math.pow(this.getX() - this.getA(), 2))) + getB());
    }

    /**
     * A continuación nos ocuparemos de calcular el valor de la coordenada x
     * cuando cambia la coordenada y, es decir, cuando conocemos el valor de y
     *
     * @exception y debe ser menor o igual al valor del radio
     * @see this.setY(float y)
     */
    public void CambiaY() {
        /**
         * ((x - a)^2)^(1/2) = (r^2 - (y - b)^2)^(1/2)
         * luego
         * x = (r^2 - (y - b)^2)^(1/2) + a
         * entonces:
         */
        this.setX((float) (Math.sqrt(Math.pow(this.getR(), 2) - Math.pow(this.getY() - this.getB(), 2))) + getA());
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
