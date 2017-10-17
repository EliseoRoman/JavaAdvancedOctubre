
package javaadvancedoctubre.Lunes.Banco;

public class Bank {
    float getRateOfInterest(){
        return 0;
    }
}
class SBI extends Bank{
    float getRateOfInterest(){
        return 8.3f;
    }
}
class ICICI extends Bank{
    float getRateOfInterest(){
        return 7.3f;
    }
}
class AXIS extends Bank{
    float getRateOfInterest(){
        return 9.7f;
    }
}
class PruebaBanco{
    public static void main(String[] args) {
        //Redefinicion
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        
        System.out.println("SBI tasa de ineteres: " + s.getRateOfInterest());
        System.out.println("ICICI tasa de ineteres: " + i.getRateOfInterest());
        System.out.println("AXIS tasa de ineteres: " + a.getRateOfInterest());
        
        //Polimorfismo
        Bank b;
        b = new SBI();
        System.out.println("SBI tasa de ineteres: " + b.getRateOfInterest());
        b = new ICICI();
        System.out.println("ICICI tasa de ineteres: " + b.getRateOfInterest());
        b = new AXIS();
        System.out.println("AXIS tasa de ineteres: " + b
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                .getRateOfInterest());
        
    }
}