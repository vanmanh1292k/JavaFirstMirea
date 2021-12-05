package ru.mirea.task19.Patient;

public class ValidateException extends Exception {
    public ValidateException(Exception e)  {
        super(e);
    }
}