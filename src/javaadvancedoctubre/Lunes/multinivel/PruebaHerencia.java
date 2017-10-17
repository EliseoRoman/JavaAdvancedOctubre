
package javaadvancedoctubre.Lunes.multinivel;

class Animal{
    void comer(){
        System.out.println("Comiendo...");
    }
}
class Perro extends Animal{
    void ladrar(){
        System.out.println("Lardando...");
    }
}
class   Cachorro extends Perro{
    void correr(){
        System.out.println("Corriendo...");
    }
}
public class PruebaHerencia {
    public static void main(String[] args) {
        Cachorro  c = new Cachorro();
        c.comer();
        c.correr();
        c.ladrar();
    }
}
