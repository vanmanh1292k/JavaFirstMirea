package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GuessGame extends JFrame {
    JLabel lb = new JLabel("Guess the number (1-20): ");

    JTextField txt = new JTextField(10); // chieu dai khung text
    JButton btn1 = new JButton("OK"); // tao 1 JButton co ten OK
    Random random = new Random();
    int guessNumber = random.nextInt(20);
    int times = 1;

    public GuessGame() {
        super("Guess a number!"); // ke thua ham tao ten cua so
        setVisible(true); // cho cua so xuat hien tren man hinh
        setDefaultCloseOperation(EXIT_ON_CLOSE); // tao nut thoat cho cua so
        setSize(300, 200); //cai dat size cua so
        setLayout(new FlowLayout());  //set lay out của btn1

        add(lb);
        add(txt);
        add(btn1);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // nếu sau 3 lần, giá trị số nguyên của chuỗi != guessNumbe trả về lose
                if(times == 3 && Integer.parseInt(txt.getText()) != guessNumber) {
                    JOptionPane.showMessageDialog(null, "You lose! The number is " + guessNumber); // trả về tiêu đề và icon mặc định
                    System.exit(0); // out và kết thúc c trình
                }

                if (Integer.parseInt(txt.getText()) == guessNumber) {
                    JOptionPane.showMessageDialog(null, "You win!");
                    System.exit(0);
                }
                else if (Integer.parseInt(txt.getText()) < guessNumber && times != 3) {
                    JOptionPane.showMessageDialog(null, "The number to find is larger!");
                    times++;
                }
                else if (Integer.parseInt(txt.getText()) > guessNumber && times != 3) {
                    JOptionPane.showMessageDialog(null, "The number to find is smaller!");
                    times++;
                }
            }
        });
    }

    public static void main(String[] args) {
        new GuessGame();
    }
}
