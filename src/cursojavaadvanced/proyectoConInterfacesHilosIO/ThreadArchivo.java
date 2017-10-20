package cursojavaadvanced.proyectoConInterfacesHilosIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class ThreadArchivo extends Thread{
    
    public void run() {
        try {
            FileInputStream fis = new FileInputStream("docs/maluma.txt");
            FileInputStream fis2 = new FileInputStream("docs/shakira.txt");
            FileInputStream fis3 = new FileInputStream("docs/ricky.txt");
            
            FileOutputStream fos = new FileOutputStream("docs/concierto.txt");
            SequenceInputStream sis = new SequenceInputStream(fis, fis2);
            SequenceInputStream sis2 = new SequenceInputStream(sis, fis3);
            
            int i = 0;
            while((i = sis2.read()) != -1){
                fos.write(i);
            }
            sis2.close();
            fos.close();
            fis.close();
            fis2.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        
    }
    
}
