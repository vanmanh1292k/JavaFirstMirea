package ru.mirea.task1.opt5;

public class Task_5 {
    public static void main(String[] arg){
        for(int i = 1; i <= 10; i ++){
            float n = 0;
            System.out.print("number " + i + ": ");
            for(int j = 1; j <= i; j++){
                n += (1/(float)j);
            }
            System.out.println(n);
        }
    }
}


