/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvancedoctubre.Lunes.Tareas;

/**
 *
 * @author Roman
 */
public class Gato extends Animal{
    
    /**
    * 
    * @param nombre, la clase Gato hereda de la clase animal
    */
    public Gato(String nombre) {
        super(nombre);
        System.out.println("Constructor Gato, nombre : " + nombre);
    }
 
    public void tipoAnimal() {
        System.out.println("Tipo Animal : Es un Gato");
    }
 
    public void comunicarse(){
        System.out.println("Metodo comunicarse : El gato maulla...");
    }
    
}
