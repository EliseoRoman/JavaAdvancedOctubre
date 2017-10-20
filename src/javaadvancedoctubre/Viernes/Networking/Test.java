
package javaadvancedoctubre.Viernes.Networking;

import java.io.IOException;
import java.net.URL;

public class Test {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://codigofacilito.com/");
            System.out.println("Protocolo: " + url.getProtocol());
            System.out.println("Host Name: " + url.getHost());
            System.out.println("Port Numeber: " + url.getPort());
            System.out.println("File Name: " + url.getFile());
            
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
