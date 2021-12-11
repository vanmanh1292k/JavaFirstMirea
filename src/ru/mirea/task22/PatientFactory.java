package ru.mirea.task22;
import ru.mirea.task22.PatientEmergency;
import ru.mirea.task22.PatientFollowUp;
import ru.mirea.task22.Patient;
public class PatientFactory {
    public static Patient getPatient(String type,String ID, String Name,String Birthday, String Gender, String Birthplace, int AGE){
        if("PatientEmergency".equalsIgnoreCase(type)) return new PatientEmergency(ID,Name,Birthday,Gender,Birthplace,AGE);
        else {
            if ("PatientFollowUp".equalsIgnoreCase(type))
                return new PatientFollowUp(ID, Name, Birthday, Gender, Birthplace, AGE);
        }

        return null;
    }
}