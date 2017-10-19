
package javaadvancedoctubre.Jueves.IO;

import java.io.Console;
import java.util.Scanner;

public class TestIO13 {
    public static void main(String[] args) {
        System.out.println("Escribe tu nombre:");
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();
        System.out.println("Bienvenido: " + n);
    }
}
