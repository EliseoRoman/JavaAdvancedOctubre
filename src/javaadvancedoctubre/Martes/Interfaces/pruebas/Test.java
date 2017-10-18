
package javaadvancedoctubre.Martes.Interfaces.pruebas;

import javaadvancedoctubre.Martes.Interfaces.Drawable;
import javafx.scene.shape.Circle;

public class Test {
    public static void main(String[] args) {
        Drawable d = (Drawable) new Circle();
        d.draw();
    }
}
