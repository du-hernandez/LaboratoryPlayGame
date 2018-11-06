/*
 * Esta clase constituirá el lienzo de nuestra aplicación, es decir, a través
 * de la cual mostraremos al usuario nuestra creación
 */
package UI;

import java.awt.Graphics;
import javax.swing.JPanel;

import animations.AnimCircunferencia;
import assets.ImageCollection;

/**
 *
 * @author Duverney Hernandez Mora
 */
public class Lienzo extends JPanel implements Runnable {

    private ImageCollection colection = new ImageCollection();
    //Circunferencia animador = new Circunferencia(30, 30, 25);
    private Thread TheThread = new Thread(this);
    //AnimCircunferencia animado = new AnimCircunferencia(500, 500, 100, 15, 5, true);
    AnimCircunferencia animados[] = new AnimCircunferencia[5];

    public Lienzo() {
//        animador.setX(25);
//        animador.CambiaX();
//        animador.setY(25);
//        animador.CambiaY();
        animados[0] = new AnimCircunferencia(550, 300, 150, 15, 5, true);
        animados[1] = new AnimCircunferencia(550, 300, 50, 15, 5, false);
        animados[2] = new AnimCircunferencia(550, 300, 200, 15, 5, true);
        animados[3] = new AnimCircunferencia(550, 300, 100, 15, 5, false);
        animados[4] = new AnimCircunferencia(550, 300, 120, 15, 5, true);
        for (int i = 0; i < animados.length; i++) {
            animados[i].start();
        }
        this.TheThread.start();
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(colection.ImageCollection[1], 0, 0, this);
        for (int i = 0; i < animados.length; i++) {
            animados[i].circuns.paintPoint(g);
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                this.repaint();
                TheThread.sleep(30);
            } catch (InterruptedException ex) {
            }
            repaint();
        }
    }
}
