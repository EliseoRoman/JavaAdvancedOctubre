package javaadvancedoctubre.Jueves.IO;

import java.io.Console;
//Solo por consola
public class TestIO12 {
    public static void main(String[] args) {
        Console c = null;
        c = System.console();
        System.out.println("asd");
        if(c != null){
            String n = c.readLine();
            System.out.println("Bienvenido: " + n);
        }
        
    }
}
