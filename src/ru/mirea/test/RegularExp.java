package ru.mirea.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.io.FileReader;
import java.util.regex.Matcher;

public class RegularExp {
    public static void main(String[] args){
        //Pattern — предоставляет скомпилированное представление регулярного выражения.
        Scanner input = new Scanner(System.in);
        System.out.println("Введите фамилию бронировавшего:");
        String surname = input.next();
        Pattern pattern = Pattern.compile("^"+ ".* " + "фамилия: " +surname+ ".*");
        Matcher matcher;
        try(FileReader reader = new FileReader("D:/Java/data.txt")){
            BufferedReader br = new BufferedReader(reader);
            String line = br.readLine();
            while (line != null)
            {
                matcher = pattern.matcher(line);
                while (matcher.find()) {
                    System.out.println(line.substring(matcher.start(), matcher.end()));
                }
                line = br.readLine();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}