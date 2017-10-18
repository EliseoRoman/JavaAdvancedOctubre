package javaadvancedoctubre.Miercoles;

public class MultiHilos extends Thread{
    
    public void run(){
        System.out.println("corriendo");
    }
    
    public static void main(String[] args) {
        MultiHilos t1 = new MultiHilos();
        t1.start();
    }
    
}
