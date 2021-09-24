package ru.mirea.task3.Circle;

import java.util.Scanner;
public class TestCircle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle(10.5f);
        System.out.println(c.P());
        System.out.println(c.S());
        System.out.print("change radius: ");
        float x = sc.nextFloat();
        c.setRadious(x);
        System.out.print(c.getRadious());
    }
}
