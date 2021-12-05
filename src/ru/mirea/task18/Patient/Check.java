package ru.mirea.task18.Patient;
public class Check {
    public static void checkGPA(int age) throws AGE_Under_18, AGE_Err {
        if (age < 0) {
            throw new AGE_Err("The age you entered (" + age + ") is incorrect");
        } else if (age > 0 && age < 16 ) {
            throw new AGE_Under_18("Not old enough to get the covid 19 vaccine :  " + age );
        }
        System.out.println("Eligible age: " + age );
    }
}