/*
 * A través de esta clase nos encargamos de centralizar todos lo que componen
 * nuestra aplicación
 */
package controller;

import UI.*;
import assets.ImageCollection;

/**
 *
 * @author Duverney Hernandez Mora
 */
public class index {

    private ImageCollection images = new ImageCollection();
    private Lienzo pintor = new Lienzo();

    public index() {
        Window window = new Window("Laboratory play game", images.ImageCollection[0], false, true, true);
        window.add(pintor);
    }
}
