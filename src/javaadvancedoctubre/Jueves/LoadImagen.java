package javaadvancedoctubre.Jueves;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javaadvancedoctubre.concierto.LoadImageApp;
import javax.swing.JFrame;

public class LoadImagen extends Thread{

    public void run() {
        try {
            display("img/m1.jpg");
            Thread.sleep(2000);
            display("img/m2.jpg");
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
    }
    
    public static void display(String imagen){
        JFrame f = new JFrame("Load");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
            
        });
        f.add(new LoadImageApp(imagen));
        f.pack();
        f.setVisible(true);
    }
    /*
    public static void main(String[] args) {
        HiloImagen t1 = new HiloImagen();
        t1.start();
    }*/
    
}
