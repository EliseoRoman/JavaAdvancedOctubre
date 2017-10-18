package javaadvancedoctubre.Martes.Interfaces.acciones;

import javaadvancedoctubre.Martes.Interfaces.Drawable;

class Rectangle implements Drawable{
    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }
    
}
class Circle implements Drawable{

    public void draw() {
        System.out.println("Drawing a circle");
    }
    
}
public class Figuras {
    public static void main(String[] args) {
        Drawable d = new Circle();
        d.draw();
    }
}
