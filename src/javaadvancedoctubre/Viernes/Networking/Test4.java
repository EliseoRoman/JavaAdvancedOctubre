
package javaadvancedoctubre.Viernes.Networking;

import java.net.InetAddress;

public class Test4 {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.oracle.com");
            System.out.println("Nombre del Host: " + ip.getHostName());
            System.out.println("Direccion ip: " + ip.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
