package ru.mirea.task1.opt3;

import java.util.Arrays;

public class Task1_3 {
    public static void main(String args[]) {
        int[] a = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(a));
        int length = a.length;
        int i=0;
        int s=0;
        for (i = 0; i < length; i++){
            s += a[i];
        }
        System.out.println(s);

        s = 0;
        i = 0;
        while(i<length){
            s+=a[i];
            i++;
        }
        System.out.println(s);

        s=0;
        i--;
        do{
            s+=a[i];
            i--;
        }while(i>=0);
        System.out.println(s);
    }
}
