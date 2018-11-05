/*
 * A través de esta clase crearemos la ventana a través de la cual haremos
 * contacto con el usuario
 */
package UI;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Duverney Hernandez Mora
 */
public class Window extends JFrame {

    public Window(String Title, BufferedImage ImageIcon, boolean Undecorated, boolean Resizable, boolean Visible) {
        super(Title);
        setResizable(Resizable);
        Toolkit ResWindow = Toolkit.getDefaultToolkit();
        Dimension Dimension = ResWindow.getScreenSize();
        setSize(Dimension);
        setLocationRelativeTo(this);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(Undecorated);
        setIconImage(ImageIcon);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(Visible);
    }
}
