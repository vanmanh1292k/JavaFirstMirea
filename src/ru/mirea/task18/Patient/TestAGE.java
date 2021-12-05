package ru.mirea.task18.Patient;

public class TestAGE {
    public static void main(String[] args)
    {
<<<<<<< HEAD
        int age = 14;
=======
        int age = 20;
>>>>>>> origin/master
        System.out.println("Check your AGE: ");

        try {
            Check.checkGPA(age);
<<<<<<< HEAD
            System.out.println("You are eligible ! ");

        } catch (AGEException e) {
            System.out.println("Your age error ! ");
=======
            System.out.println("You are eligible !");

        } catch (AGEException e) {
            System.out.println("Your score error");
>>>>>>> origin/master
            System.out.println(e.getMessage());

        }
    }
}
