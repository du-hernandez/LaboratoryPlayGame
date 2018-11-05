/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assets;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Duverney Hernandez Mora
 */
public class ImageCollection {
    
    private String LocationImage[];
    public BufferedImage ImageCollection[];

    public ImageCollection() {
        LocationImage = new String[2];
        LocationImage[0] = "/assets/images/Icon.png";
        LocationImage[1] = "/assets/images/Icon.png";

        ImageCollection = new BufferedImage[LocationImage.length];
        for (int i = 0; i < ImageCollection.length; i++) {
            try {
                ImageCollection[i] = ImageIO.read(getClass().getResource(LocationImage[i]));
            } catch (IOException Exception) {
            }
        }
    }
}
