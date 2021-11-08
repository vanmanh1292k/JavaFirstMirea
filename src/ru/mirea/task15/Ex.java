package ru.mirea.task15;

import java.io.*;
import java.util.Scanner;

public class Ex
{
    public static void writeToFileFromKeyboard(String path, boolean appendMode) throws IOException{
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        File file = new File(path);
        file.createNewFile();

        try {
            FileWriter fw = new FileWriter(file, appendMode);
            fw.write(text);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("No such file.");
            System.exit(1);
        }
    }

    public static String readFromFile(String path) throws IOException {
        File file = new File(path);

        String currLine = new String();
        StringBuilder fileData = new StringBuilder();

        try {
            BufferedReader buffReader = new BufferedReader(new FileReader(file));

            while ((currLine = buffReader.readLine()) != null) {
                fileData.append(currLine);
            }
        } catch (IOException e) {
            System.out.println("No such file.");
            System.exit(1);
        }

        return fileData.toString();
    }

    public static void appendToFile(String path) throws IOException{
        try{
            File file =new File(path);
            if(!file.exists()){
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            Scanner sc = new Scanner(System.in);
            System.out.println("insert information: ");
            String mycontent = sc.nextLine();
            bw.write(mycontent);
            bw.close();

            System.out.println("Data successfully appended at the end of file");

        }catch(IOException ioe){
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException{
        writeToFileFromKeyboard("C:/Users/taoth/OneDrive - РТУ МИРЭА/Desktop/testJava.txt", false);

        String fileData = readFromFile("C:/Users/taoth/OneDrive - РТУ МИРЭА/Desktop/testJava.txt");
        System.out.println(fileData);

        writeToFileFromKeyboard("C:/Users/taoth/OneDrive - РТУ МИРЭА/Desktop/testJava.txt", false);
        fileData = readFromFile("C:/Users/taoth/OneDrive - РТУ МИРЭА/Desktop/testJava.txt");
        System.out.println(fileData);


        appendToFile("C:/Users/taoth/OneDrive - РТУ МИРЭА/Desktop/testJava.txt");
        fileData = readFromFile("C:/Users/taoth/OneDrive - РТУ МИРЭА/Desktop/testJava.txt");
        System.out.println(fileData);

        //writeToFileFromKeyboard("C:/Users/taoth/OneDrive - РТУ МИРЭА/Desktop/testJava.txt", true);
    }
}
