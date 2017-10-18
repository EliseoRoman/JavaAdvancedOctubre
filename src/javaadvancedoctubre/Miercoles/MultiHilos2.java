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
public class MultiHilos2 implements Runnable{

    public void run() {
        System.out.println("Corriendo");
    }
    public static void main(String[] args) throws InterruptedException {
        MultiHilos2 m2 = new MultiHilos2();
        Thread t2 = new Thread(m2);
        t2.setName("hilo 1");
        System.out.println(t2.getName());
        //t2.start();
        if(t2.isAlive()){
            System.out.println("Hilo vivo");
        }else
            System.out.println("Hilo muerto");
        t2.run();
        
        Thread t3 = new Thread();
        t3.setName("Hilo3");
       
        System.out.println(Thread.currentThread().getName());
    }
    
}
