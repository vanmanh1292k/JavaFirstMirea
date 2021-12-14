package ru.mirea.task29;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class DeSerializationDemo {
    public static void main(String[] args){
        Patient pt = null;
        try{
            FileInputStream fIn = new FileInputStream("D:\\java\\testTask29.txt");
            ObjectInputStream in = new ObjectInputStream(fIn);
            pt = (Patient) in.readObject();
            in.close();
            fIn.close();

            System.out.println(pt.toString());

        } catch(Exception ex){

        }
    }
}
