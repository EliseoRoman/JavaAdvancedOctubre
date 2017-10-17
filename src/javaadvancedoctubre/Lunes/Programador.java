
package javaadvancedoctubre.Lunes;
/*

existen diversas clasificaiones de relaciones en la herencia:

Relaciones entre calses: Asociacion, Composicion, Agregacion y Herencia.

Hay un termino que permite distinguir los distintos tipos de relaciones,
llamados ACOPLAMIENTO.

*- Medida de dependencia que hay entre 2 modulos,
existen grados de acoplamiento (bajo/alto)
*-Cada clase  metodo hace una sola cosa y la hace bien
(COHESION), Numero de tareas que tiene cada clase o metodo.

Es deseable que 2 o mas modulos de un programa tengas alta cohesion
y bajo acoplamiento.

Relaciones entre clases:
Asociacion(Es UN): Cuando entre dos  mas clases se da una iteracion
que no modifica nada en el comportamiento de los objetos
antes o despues de terminada la relacion.
la asociacion es un modo de iteracion entre objetos donde uno utiliza los
servicios de otro a corto plazo.

La asociacion es una relacion de objetos debidamente acoplados.

Agregacion (Tiene UN): Es una relacion entre objetos que afecta
el comportamiento entre ellos, mientras que dura la relacion. Es
decir, un objetos depende de los servicios de otro a largo plazo.

Composicion (Contiene UN): cuando un objeto complejo usa otros
objetos permanentemente. La composicion es una relacion entre objetos
cuya escencia tiene sentido solo cuando ellos estan acoplados

Herencia: Cuando un objeto tiene las caracteristicas de otro permanentemente,
tendremos una relacion entre objetos intimamente acoplados cuya existencia
depende de un ancestro padre.


* @author HP
*/

class Empleado{
    float salario = 40000;
}

public class Programador extends Empleado{
    
    int bono = 10000;
    
    public static void main(String[] args) {
        String msg = "";
        Programador p = new Programador();
        msg += "El salario del programador es: " + p.salario;
        System.out.println(msg);
        System.out.println("El bono es: " + p.bono);
    }
    
}
