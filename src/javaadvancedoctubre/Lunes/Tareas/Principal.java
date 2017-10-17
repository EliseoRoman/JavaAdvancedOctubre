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
public class Principal {
    
    public static void main(String[] args) {
        
        /**Creamos anim, un objeto Perro de tipo Animal*/
        Animal anim = new Perro("zeus") ;
        anim.tipoAnimal();
        anim.comunicarse();
        System.out.println();

        /**Creamos cat, un objeto Gato de tipo Animal*/
        Animal cat = new Gato("micha");
        cat.tipoAnimal();
        cat.comunicarse();
        System.out.println();

        /**Creamos cat, un objeto Gato de tipo IAnimal
         * Para esto aplicamos polimorfismo usando la Interface*/
        IAnimal gato = new Gato("pitufa");
        cat.comunicarse();
        
    }
    
}
