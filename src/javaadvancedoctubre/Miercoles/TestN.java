package javaadvancedoctubre.Miercoles;

//Name, ID, Priority, State, Current Thread, 
public class TestN extends Thread{

    public void run() {
        System.out.println("Running");
    }
    public static void main(String[] args) {
        TestN t1 = new TestN();
        TestN t2 = new TestN();
        
        System.out.println("Nombre T1: " + t1.getName());
        System.out.println("Nombre T2: " + t2.getName());
        
        System.out.println("ID T1: " + t1.getId());
        System.out.println("ID T2: " + t2.getId());
        
        System.out.println("Priority T1: " + t1.getPriority());
        System.out.println("Priority T2: " + t2.getPriority());
        
        System.out.println("State T1: " + t1.getState());
        System.out.println("State T2: " + t2.getState());
        
        System.out.println("Nombre T1: " + Thread.currentThread().getName());
        System.out.println("Nombre T2: " + Thread.currentThread().getName());
        
        t1.start();
        t2.start();
    }
}
