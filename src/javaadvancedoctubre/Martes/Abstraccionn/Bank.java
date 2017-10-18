package javaadvancedoctubre.Martes.Abstraccionn;

abstract class Bank {
    abstract float getRateOfInterest();
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
class Test{
    public static void main(String[] args) {
        Bank b;
        String msg = "", msg2 = "", msg3 = "";
        b = new SBI();
        msg += "Rate of ineterest is: " + b.getRateOfInterest();
        msg += " %";
        System.out.println(msg);
        
        b = new ICICI();
        msg2 += "Rate of ineterest is: " + b.getRateOfInterest();
        msg2 += " %";
        System.out.println(msg2);
        
        b = new AXIS();
        msg3 += "Rate of ineterest is: " + b.getRateOfInterest();
        msg3 += " %";
        System.out.println(msg3);
    }
}