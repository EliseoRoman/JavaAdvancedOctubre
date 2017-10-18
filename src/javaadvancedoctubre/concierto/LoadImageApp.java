package javaadvancedoctubre.concierto;

import javaadvancedoctubre.Lunes.Tareas.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.applet.AudioClip;

public class LoadImageApp extends Component {
          
    BufferedImage img;

    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }

    public LoadImageApp(String imagen) {
       try {
           img = ImageIO.read(new File(imagen));
       } catch (IOException e) {
       }

    }
   

    public Dimension getPreferredSize() {
        if (img == null) {
             return new Dimension(100,100);
        } else {
           return new Dimension(img.getWidth(null), img.getHeight(null));
       }
    }
    
    public static void main(String[] args) {
        JFrame f = new JFrame("Load Image Sample");
        String image = "meme_pc.jpg";
        
        f.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
        f.add(new LoadImageApp(image));        
        f.pack();
        f.setVisible(true);
    }
}
