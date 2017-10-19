
package javaadvancedoctubre.Jueves.Sincronizacion;

class Mesa2{
    synchronized void mostrarMesa(int n){
        for(int i = 1; i <= 5; i++){
            System.out.println(n * i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}
public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        final Mesa mesa = new Mesa();
        
        Thread t1 = new Thread(){
            public void run(){
                mesa.mostrarMesa(5);
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                mesa.mostrarMesa(100);
            }
        };
        
        t1.start();
        t2.start();
        
    }
}
