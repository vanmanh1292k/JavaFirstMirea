package ru.mirea.task30;

import org.junit.Test;

import static org.junit.Assert.*;

public class PatientTest {














    @org.junit.Test
    public void getHospitalsFee() {
        int hospitalFeesFor20Days = 40000;
        Patient patient = new Patient("001", "Jennie ", "20-10-2003",
                "Female",15,20, false);
        int actualResult = patient.getHospitalsFee();
        assertEquals(hospitalFeesFor20Days,actualResult);
    }


    @Test
    public void testToString() {
        String expectedResult = "Patient{ID='001', Name='Jennie ', Birthday='20-10-2003', Gender='Female', AGE=15, NumberOfDays=20, HaveInsuranceCard=false}";
        Patient patient = new Patient("001", "Jennie ", "20-10-2003","Female",15,20, false);
        String actualResult = patient.toString();
        assertEquals(expectedResult,actualResult);
    }


}