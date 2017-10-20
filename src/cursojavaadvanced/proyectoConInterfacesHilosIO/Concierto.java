package cursojavaadvanced.proyectoConInterfacesHilosIO;

import javaadvancedoctubre.concierto.Artista;
import java.io.IOException;

public class Concierto{
    //private JFrame f;
    private Artista artista = null;
    
    public Concierto(Artista a) {
        //f = new JFrame(a.getNombre());
        artista = a;
    }
    /*
    @Override
    public void run() {
    presenta(artista);
    canta(artista);
    }*/
    
    public static void main(String[] args) throws InterruptedException ,IOException{
        
        
        
        final ImpAcciones art1 = new ImpAcciones();
        /*ImpAcciones art2 = new ImpAcciones();
        ImpAcciones art3 = new ImpAcciones();*/
        
        Thread maluma = new Thread(){
            public void run(){
                Artista a1 = new Artista("Maluma", "Colombiano", "Reggaeton", 25);
                art1.presenta(a1);
                art1.canta(a1);
            }
        };
        Thread shakira = new Thread(){
            public void run(){
                Artista a2 = new Artista("Shakira", "Colombiana", "Banda", 40);
                art1.presenta(a2);
                art1.canta(a2);
            }
        };
        Thread ricky = new Thread(){
            public void run(){
                Artista a3 = new Artista("Ricky", "Estadounidense", "Pop", 41);
                art1.presenta(a3);
                art1.canta(a3);
            }
        };
        ThreadArchivo tArchivo = new ThreadArchivo();
        
        maluma.start();
        maluma.join();
        shakira.start();
        shakira.join();
        ricky.start();
        tArchivo.start();
    }
    
}
