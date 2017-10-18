package javaadvancedoctubre.Miercoles.Excepciones;


public class Test {
    public static void main(String[] args) {
        
        try {
            int data = 50/0;
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        }
        System.out.println("Lo que sigue");
        
    }
}
