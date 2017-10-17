package javaadvancedoctubre.Lunes;

public class Estudiante {
    
    int matricula;
    String nombre;
    static String escuela = "ITL";
    String msg = "";
    //Constructor

    public Estudiante(int matricula,String nombre) {
        this.matricula = matricula;
        this.nombre = nombre;              
    }
    
    void display(){
        msg += "matricula: "  + matricula;
        msg += "\nnombre: " + nombre;
        msg += "\nescuela: " + escuela;
        System.out.println(msg);
    }
    
    public static void main(String[] args) {
        Estudiante s1 = new Estudiante(111, "David");
        Estudiante s2 = new Estudiante(111, "David");
        
        s1.display();
        s2.display();
    }
    
}
