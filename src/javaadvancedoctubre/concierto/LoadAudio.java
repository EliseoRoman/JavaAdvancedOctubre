/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvancedoctubre.concierto;
import java.applet.AudioClip;

public class LoadAudio {
    public LoadAudio(String ruta){
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource(ruta));
        sonido.play();
    }
}
