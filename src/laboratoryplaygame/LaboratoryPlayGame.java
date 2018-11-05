/*
 * El objetivo principal del desarrollo del juego es hallar aplicabilidad a
 * múltiples temas de las ciencias matemáticas aplicadas a la ingeniería, entre
 * ellos, el trabajo con funciones lineales (fundamentales en programación
 * lineal y todas sus variantes (entera, binaria y mixta)), trigonometría, etc.,
 * y demás temas abordados en la carrera Ingeniería de Sistemas de la
 * Universidad de la Amazonia y que constituye la materialización de mis
 * recuerdos de todos los docentes que entregaron lo mejor de si mismos no solo
 * desde la parte teórico-práctico sino que supieron llegar a la mente y al
 * corazón
 */
package laboratoryplaygame;

/**
 *
 * @author Duverney Hernandez Mora
 */
import UI.Window;
import assets.ImageCollection;

public class LaboratoryPlayGame {

    private static ImageCollection images = new ImageCollection();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Window window = new Window("Laboratory play game", images.ImageCollection[0], false, true, true);
        //System.out.println(Math.pow(5, 2));
    }
}
