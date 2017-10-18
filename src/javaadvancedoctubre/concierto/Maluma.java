/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvancedoctubre.concierto;

import javaadvancedoctubre.concierto.LoadAudio;

public class Maluma extends Acciones{
    
    void cantar() {
        new LoadAudio("/javaadvancedoctubre/Lunes/Tareas/audio1.wav");
    }
    void presentar() {
        new LoadImageApp("meme_pc.jpg");
    }

    void perfil() {
        
    }
    
}
