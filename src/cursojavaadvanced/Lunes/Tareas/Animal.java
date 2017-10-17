/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.Lunes.Tareas;

/**
 *
 * @author Roman
 */
public abstract class Animal implements IAnimal{
    
    private String nombre;
    
    public Animal (String nombre){
        this.nombre = nombre;
        System.out.println("Constructor Animal, " + "nombre del animal : " + this.nombre);
    }

    public String getNombre(){
        return nombre;
    }
    
    /**
    * Metodo Abstracto tipoAnimal, la implementación depende
    * de las clases concretas que extiendan la clase Animal
    */
    public abstract void tipoAnimal();

}
