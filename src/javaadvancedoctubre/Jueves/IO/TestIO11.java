
package javaadvancedoctubre.Jueves.IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestIO11 {
    public static void main(String[] args)throws IOException{
        FileInputStream fis = new FileInputStream("C:\\a.txt");
        
        DataInputStream din = new DataInputStream(fis);
        
        int c = fis.available();
        byte [] array = new byte[c];
        fis.read(array);
        
        for(byte n : array){
            char l = (char)n;
            System.out.print(l + "*");
        }
        fis.close();
        din.close();
    }
}
