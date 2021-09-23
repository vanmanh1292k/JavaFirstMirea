package ru.mirea.task1.opt_7;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = sc.nextInt();
        int fac = 1;
        for(int i = 1; i <= n; i++){
            fac *= i;
        }
        System.out.print("Factorial of the number " + n + ": " + fac );
    }
}
