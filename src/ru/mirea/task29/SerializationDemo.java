package ru.mirea.task29;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo  {
    public static void  main(String[] args){
        Patient pt = new Patient("001", "Jennie ", "20-10-2003","Female",15);

        try{
            FileOutputStream fOut = new FileOutputStream("D:\\java\\testTask29.txt");
            ObjectOutputStream out = new ObjectOutputStream(fOut);
            out.writeObject(pt);
            out.close();
            fOut.close();

        } catch(Exception ex){
        }

    }
}
