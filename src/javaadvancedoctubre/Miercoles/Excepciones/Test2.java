package javaadvancedoctubre.Miercoles.Excepciones;


public class Test2 {
    public static void main(String[] args) {
        try{
            int a[] = new int[5];
            a[6] = 30/0;
            a[6] = 30;            
        }catch(ArithmeticException ae){
            System.out.println(ae);
        }catch(ArrayIndexOutOfBoundsException aioe){
            System.out.println(aioe);
        }
        System.out.println("Lo que sigue");
    }
}
    
