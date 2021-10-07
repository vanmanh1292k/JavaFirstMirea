package ru.mirea.task8;

//import com.sun.corba.se.impl.orbutil.graph.Graph;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public abstract class Shape extends JFrame {
    Random rd = new Random();
    protected float r, g, b;
    protected Color cl;
    protected int x, y;
    protected int MAX_WIDTH = 900, MAX_HEIGHT = 900;

    Shape() {
        r = rd.nextFloat();
        g = rd.nextFloat();
        b = rd.nextFloat();
        x = rd.nextInt(MAX_WIDTH - 200);
        y = rd.nextInt(MAX_HEIGHT - 200);
        cl = new Color(r, g, b);
    }

    public abstract void paint(Graphics g);
}