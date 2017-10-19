package javaadvancedoctubre.Jueves.Thread;
//Simple Task by multiple threads
public class TestM extends Thread{
    
    public void run(){
        System.out.println("Una sola tarea");
    }
    public static void main(String[] args) {
        TestM t1 = new TestM();
        TestM t2 = new TestM();
        TestM t3 = new TestM();
        
        t1.start();
        t2.start();
        t3.start();
    }
}
