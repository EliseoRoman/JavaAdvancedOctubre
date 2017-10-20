
package javaadvancedoctubre.Viernes.io;

import java.io.FileWriter;
import java.io.IOException;

public class TestIO15 {
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("C:\\uno.txt");
        fw.write("Hola Java");
        fw.close();
        System.out.println("Listo");
    }
}
