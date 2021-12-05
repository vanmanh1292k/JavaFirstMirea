package ru.mirea.task19.Patient;

public class Test {
    public static void main(String[] args) {

        // One patient test. I use _ Wrap an Exception in another Exception
        Patient patient = new Patient("001", "Jennie", "20-10-2003","Female",15);

        try {

            ValidateUtils.checkPatient(patient);

        } catch (ValidateException wrap) {

            Exception cause = (Exception) wrap.getCause();

            if (cause != null) {
                System.out.println("Your age error!, cause: " + cause.getMessage());
            } else {
                System.out.println(wrap.getMessage());
            }
        }
    }
}