package ru.mirea.task22;

public class TestFactory {
    public static void main(String[] args)
    {
        Patient PE = PatientFactory.getPatient("PatientEmergency","2020I1","Anna","05/02/1987","FeMale","Russia",34);
        Patient PFU = PatientFactory.getPatient("PatientFollowUp","2020I3","Anton","05/07/1946","Male","Russia",75);
        System.out.println("Factory Emergency Patient: " + PE);
        System.out.println("Factory Follow-up Patient: " + PFU);
    }

}