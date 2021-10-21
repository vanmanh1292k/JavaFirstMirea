package ru.mirea.task10;

import java.util.Scanner;

public class TestNoTwoZeros {

    public static int rec(int a,int b){
        if (a-1>b){
            return 0;
        }
        if (a==0 || b==0){
            return 1;
        }
        return rec(a,b-1)+rec(a-1,b-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number a: ");
        int a = sc.nextInt();
        System.out.print("Input number b: ");
        int b = sc.nextInt();
        System.out.println("Number of ways: " + rec(a, b));
    }


}
