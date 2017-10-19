package javaadvancedoctubre.Jueves.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestIO2 {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("C:\\b.txt");
            String s = "Hola mundo Archivos";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Listo...");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
