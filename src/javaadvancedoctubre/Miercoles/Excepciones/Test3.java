package javaadvancedoctubre.Miercoles.Excepciones;

public class Test3 {
    public static void main(String[] args) {
        try{
            try{
                System.out.println("Division");
                int b = 39/0;
            }catch(ArithmeticException ae){
                System.out.println(ae);
            }finally{
                System.out.println("Bloque finally");
            }
            try{
                int a[] = new int[5];
                a[5] = 4;
            }catch(ArrayIndexOutOfBoundsException aioe){
                System.out.println(aioe);
            }finally{
                System.out.println("Bloque finally");
            }
        }catch(Exception e){
            System.out.println("Exception manejada");
        }finally{
                System.out.println("Bloque finally");
        }
        System.out.println("Lo que sigue");
        
    }
}
