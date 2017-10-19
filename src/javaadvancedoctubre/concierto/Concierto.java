/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvancedoctubre.concierto;

import javaadvancedoctubre.Jueves.LoadAudio;
import javaadvancedoctubre.Jueves.LoadImagen;
/**
 *
 * @author HP
 */
public class Concierto extends Thread implements AccionesArtista{

    @Override
    public void run() {
        cantar();
        presenta();
    }
    
    public static void main(String[] args) {
        Concierto c1 = new Concierto();
        Concierto c2 = new Concierto();
        
    }

    @Override
    public void cantar() {
        LoadAudio ta = new LoadAudio();
        ta.start();
    }

    @Override
    public void presenta() {
        LoadImagen ti = new LoadImagen();
        ti.start();
    }

    @Override
    public void perfil() {
        
    }
    
}
