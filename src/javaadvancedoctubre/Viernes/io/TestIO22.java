
package javaadvancedoctubre.Viernes.io;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
//Escribiendo en archivo y consola por PrintWriter
public class TestIO22 {
    public static void main(String[] args) throws IOException{
        PrintWriter pw = new PrintWriter(System.out);
        pw.write("Hola con todas las letras");
        pw.flush();
        pw.close();
        
        PrintWriter pw2 = null;
        pw2 = new PrintWriter(new File("C:\\uno.txt"));
        pw2.write("Escribiendo en un archivo ");
        pw2.flush();
        pw2.close();
    }
}
