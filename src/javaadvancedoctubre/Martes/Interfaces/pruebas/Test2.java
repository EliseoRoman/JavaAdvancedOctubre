
package javaadvancedoctubre.Martes.Interfaces.pruebas;

import javaadvancedoctubre.Martes.Interfaces.Bank;

class SBI implements Bank{
    public float getRateOfInterest(){
        return 8.3f;
    }
}
class ICICI implements Bank{
    public float getRateOfInterest(){
        return 7.3f;
    }
}
class AXIS implements Bank{
    public float getRateOfInterest(){
        return 9.7f;
    }
}
public class Test2 {
    
    public static void main(String[] args) {
        Bank b = new SBI();
        System.out.println("ROI: " + b.getRateOfInterest());
    }
}
