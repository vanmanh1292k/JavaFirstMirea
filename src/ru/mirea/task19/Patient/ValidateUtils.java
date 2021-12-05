package ru.mirea.task19.Patient;

public class ValidateUtils {
    public static void checkPatient(Patient patient) throws ValidateException {
        try {

            AGE_Utils.checkAGE(patient.getAGE());

        } catch (Exception e) {

            throw new ValidateException(e);

        }
    }
}