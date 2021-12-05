package ru.mirea.task17;

public class TestListPatient {
    public static void main(String[] args) {
        System.out.println("ID:   " + ListPatient.STUDENT_001.getID());
        System.out.print("    Name: " + ListPatient.STUDENT_001.getName());
        System.out.print("    Birthday: " + ListPatient.STUDENT_001.getBirthday());
        System.out.print("    Gender: " + ListPatient.STUDENT_001.getGender());
        System.out.println("    Birthplace: " + ListPatient.STUDENT_001.getBirthplace());

        System.out.println("ID:   " + ListPatient.STUDENT_002.getID());
        System.out.print("    Name: " + ListPatient.STUDENT_002.getName());
        System.out.print("    Birthday: " + ListPatient.STUDENT_002.getBirthday());
        System.out.print("    Gender: " + ListPatient.STUDENT_002.getGender());
        System.out.println("    Birthplace: " + ListPatient.STUDENT_002.getBirthplace());

        System.out.println("ID:   " + ListPatient.STUDENT_003.getID());
        System.out.print("    Name: " + ListPatient.STUDENT_003.getName());
        System.out.print("    Birthday: " + ListPatient.STUDENT_003.getBirthday());
        System.out.print("    Gender: " + ListPatient.STUDENT_003.getGender());
        System.out.println("    Birthplace: " + ListPatient.STUDENT_003.getBirthplace());
    }
}
