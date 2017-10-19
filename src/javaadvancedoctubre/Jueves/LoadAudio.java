
package javaadvancedoctubre.Jueves;

import java.applet.AudioClip;

public class LoadAudio extends Thread{

    public void run() {
        try {
            play("/javaadvancedoctubre/Lunes/Tareas/audio1.wav");
            
        } catch (Exception e) {
        }
    }
    
    public void play(String ruta){
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource(ruta));
        sonido.play();
    }
    
    public static void main(String[] args) {
        LoadAudio l = new LoadAudio();
        l.start();
    }
    
}
