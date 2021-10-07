package ru.mirea.task8;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestPicture extends JFrame{
    public TestPicture(){
        super("Show Picture");
        setSize(500, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);

        JLabel label = new JLabel();
        add(label);
        label.setSize(500,350);
        setPicture(label, "D:\\goal.JPG");

    }


    public void setPicture(JLabel label,String filename){
        try{
            BufferedImage image = ImageIO.read(new File(filename));
            int x = label.getSize().width;
            int y = label.getSize().height;
            int ix = image.getWidth();
            int iy = image.getHeight();
            int dx = 0;
            int dy = 0;
            if(x / y > ix / iy) {
                dy = y;
                dx = dy * ix / iy;
            } else {
                dx = x;
                dy = dx * iy / ix;
            }

            ImageIcon icon = new ImageIcon(image.getScaledInstance(500,350, image.SCALE_SMOOTH));
            label.setIcon(icon);
        }
        catch (IOException ex){
            Logger.getLogger(TestPicture.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args){
        TestPicture testPicture = new TestPicture();
        testPicture.setVisible(true);
    }
}