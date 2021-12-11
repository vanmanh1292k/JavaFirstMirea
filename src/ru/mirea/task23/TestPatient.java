package ru.mirea.task23;

import java.util.List;
import java.util.Scanner;

public class TestPatient {
    private static Object ListPatient;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ListPatient ds = new ListPatient();
        int key = 0;


        do {
            System.out.println("MENU---------------------");
            System.out.println("Please select function: ");
            System.out.println(
                    "1.Add patients to the list.\n"
                            + "2.Print the list of patients to the screen.\n"
                            + "3.Check if the list is empty or not.\n"
                            + "4.Get the number of patients on the list.\n"
                            + "5.Check if a patient exists in the list, based on the patient ID.\n"
                            + "6.Remove a patient from the list based on the patient ID..\n"
                            + "7.Search all patients based on Name entered from keyboard.\n"
                            + "8.Output a list of patients with high to low scores.\n"
                            + "0.Out program");
            key = sc.nextInt();
            sc.nextLine();

            if(key == 1 ) {
                System.out.print("Input ID: ");
                String ID = sc.nextLine();
                System.out.print("Input Name: ");
                String Name = sc.nextLine();
                System.out.print("Input Birthday: ");
                String Birthday = sc.nextLine();
                System.out.print("Input Gender: ");
                String Gender = sc.nextLine();
                System.out.print("Input Birthplace: ");
                String Birthplace = sc.nextLine();
                System.out.print("Input AGE: ");
                int AGE = sc.nextInt();
                Patient st = new Patient(ID, Name, Birthday, Gender, Birthplace, AGE);
                ds.ADD_patient(st);
            }
            else if(key == 2)
            {
                ds.Output_ListPatient();
            }
            else if(key == 3)
            {
                System.out.println("The list is empty: "+ ds.Check_EmptyList());
            }
            else if(key == 4)
            {
                System.out.println("Current quantity: " + ds.Number_ListPatient());
            }
            else if(key == 5)
            {
                System.out.println("Input ID: ");
                String ID = sc.nextLine();
                Patient st = new Patient(ID);
                System.out.println("Check patients on the list: "+ds.Check_ID(st));
            }
            else if(key == 6)
            {
                System.out.println("Input ID: ");
                String ID = sc.nextLine();
                Patient st = new Patient(ID);
                System.out.println("Remove patients from the list: "+ds.Remove_ID(st));
            }
            else if(key == 7)
            {
                System.out.println("Input Name: ");
                String Name = sc.nextLine();
                System.out.println("Search Results: ");
                ds.Find_Patient(Name);
            }
            else if(key == 8){
                ds.Sort_ListPatient();
                ds.Output_ListPatient();
            }
        }while (key!=0);
    }
}
