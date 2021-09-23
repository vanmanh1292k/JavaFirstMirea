package ru.mirea.task1.opt6;

import java.util.*;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input number of elements : ");

        int n = input.nextInt();
        int [] arr = new int[n];

        System.out.print("Random number is : ");
        for (int i=0; i<n; i++) {
            double randomDouble = Math.random();
            randomDouble = randomDouble * 100 + 1;
            arr[i] = (int) randomDouble;
            System.out.print(" " + arr[i]);
        }
        Arrays.sort(arr);
        System.out.print("\n");
        System.out.print("Array after sorting: ");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
