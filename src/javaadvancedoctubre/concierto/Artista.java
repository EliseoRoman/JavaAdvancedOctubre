/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvancedoctubre.concierto;

/**
 *
 * @author HP
 */
public class Artista {
    
    private String nombre, genero, nacionalidad;
    private int edad;

    public Artista() {
    }
    
    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean setNombre(String nombre) {
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }

    public String getGenero() {
        return genero;
    }

    public boolean setGenero(String genero) {
        if(!nombre.isEmpty()){
            this.genero = genero;
            return true;
        }else
            return false;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public boolean setNacionalidad(String nacionalidad) {
        if(!nombre.isEmpty()){
            this.nacionalidad = nacionalidad;
            return true;
        }else
            return false;
    }

    public int getEdad() {
        return edad;
    }

    public boolean setEdad(int edad) {
        if(!nombre.isEmpty()){
            this.edad = edad;
            return true;
        }else
            return false;
    }
    //ASDasd
}
