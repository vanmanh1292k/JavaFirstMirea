package ru.mirea.task8;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class TestAnimation extends JFrame{
    public TestAnimation(){
        super("Show Animation" );
        setSize(500, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);

        JLabel label = new JLabel();
        add(label);
        ImageIcon icon = new ImageIcon("D:\\meme.gif");
        label.setIcon(icon);

    }

    public static void main(String[] args){
        TestAnimation testAnimation = new TestAnimation();
        testAnimation.setVisible(true);
    }
}
