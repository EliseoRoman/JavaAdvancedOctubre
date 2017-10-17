/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package javaadvancedoctubre.Lunes;

/**
 *
 * @author HP
 */
public class Estudiante2 {
    
    int matricula;
    String nombre,msg = "";
    
    static String escuela = "ITL";
    
    static void cambio(){
        escuela = "ITC";
    }

    Estudiante2(int i, String n) {
        matricula = i;
        nombre = n;
    }
    
    void display(){
        msg += "Matricula: " + matricula;
        msg += "\nNombre: " + nombre;
        msg += "\nEscuela: " + escuela;
        System.out.println(msg);
    }
    
    public static void main(String[] args) {
        Estudiante2.cambio();
        
        Estudiante2 s1 = new Estudiante2(111, "David");
        Estudiante2 s2 = new Estudiante2(112, "Arturo");
        Estudiante2 s3 = new Estudiante2(113, "Ana");
        
        s1.display();
        s2.display();
        s3.display();
    }
    
}
