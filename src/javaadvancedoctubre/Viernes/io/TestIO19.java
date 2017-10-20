
package javaadvancedoctubre.Viernes.io;

import com.sun.xml.internal.fastinfoset.util.CharArray;
import java.io.CharArrayReader;
import java.io.IOException;
//imprime la letra y su codigo ascii
public class TestIO19 {
    public static void main(String[] args) throws IOException {
        
        char []array = {'h','o','l','a'};
        CharArrayReader reader = new CharArrayReader(array);
        
        int i = 0;
        
        while((i = reader.read()) != -1){
            char c = (char)i;
            System.out.print(c + " : ");
            System.out.println(i);
        }
    }
}
