/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvancedoctubre.Miercoles;

/**
 *
 * @author HP
 */
public class TestN2 extends Thread{
    
    public void run(){
        System.out.println("running...");
    }
    public static void main(String[] args) {
        TestN2 t1 = new TestN2();
        TestN2 t2 = new TestN2();
        
        System.out.println("Nombre T1: " + t1.getName());
        System.out.println("Nombre T2: " + t2.getName());
        
        t1.start();
        t2.start();
        
        t1.setName("Hilo 1");
        System.out.println("Despues del cambia T1 = " + t1.getName());
        t2.setName("Hilo 2");
        System.out.println("Despues del cambia T2 = " + t2.getName());
    }
    
}
