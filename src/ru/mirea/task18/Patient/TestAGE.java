package ru.mirea.task18.Patient;

public class TestAGE {
    public static void main(String[] args)
    {
        int age = 20;
        System.out.println("Check your AGE: ");

        try {
            Check.checkGPA(age);
            System.out.println("You are eligible !");

        } catch (AGEException e) {
            System.out.println("Your score error");
            System.out.println(e.getMessage());

        }
    }
}
