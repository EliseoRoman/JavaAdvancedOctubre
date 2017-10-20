/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package cursojavaadvanced.proyectoConInterfacesHilosIO;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javaadvancedoctubre.concierto.Artista;
import javaadvancedoctubre.concierto.LoadImageApp;
/**
 *
 * @author HP
 */
public class ImpAcciones implements AccionesArtista{
    
    @Override
    synchronized public void presenta(Artista a) {
        //System.out.println("Hola soy " + a.getNombre());
        String imagen = a.getNombre().trim() + ".jpg";
        String nom = a.getNombre().toLowerCase();
        //creaArchivo(a);
        leeArchivo(a.getNombre().toLowerCase());
        
        JFrame f = new JFrame("Load Image Sample");
        //System.out.println("Frame: " + f.getName());
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        f.add(new LoadImageApp(imagen));
        
        f.setVisible(true);
        switch(nom){
            case "maluma":
                f.setBounds(100,0,0,0);
                f.pack();
                break;
            case "shakira":
                f.setBounds(800,0,0,0);
                f.pack();
                break;
            case "ricky":
                f.setBounds(150,480,0,0);
                f.pack();
                break;  
        }
        /*try {
        Thread.sleep(5000);
        } catch (InterruptedException ie) {
        System.out.println(ie);
        }*/
    }
    
    @Override
    synchronized public void canta(Artista a) {
        System.out.println(a.getNombre() + " va a cantar");
        String cancion = a.getNombre().trim() + ".wav";
        try{
            Clip sonido = AudioSystem.getClip();
            File file = new File(cancion);
            sonido.open(AudioSystem.getAudioInputStream(file));
            sonido.start();
            Thread.sleep(10000); // 1000 milisegundos (1 segundos)
            sonido.close();
        }catch(Exception e){
            System.out.println("" + e);
        }
    }
    
    public void leeArchivo(String archivo){
        try {
            FileInputStream fin = new FileInputStream("docs/" + archivo + ".txt");
            int i = 0;
            while((i = fin.read()) != -1){
                System.out.print((char)i);
            }
            fin.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
}
