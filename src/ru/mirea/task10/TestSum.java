//tính tổng

package ru.mirea.task10;

import java.util.Scanner;

//использую рекурсию
public class TestSum {
    public static int sum(int number){
        return  number == 0 ? 0 : number % 10 + sum(number/10) ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.print("sum: " + sum(number));
    }
}

