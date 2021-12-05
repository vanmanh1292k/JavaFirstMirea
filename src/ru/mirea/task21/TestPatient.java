package ru.mirea.task21;
import java.util.ArrayList;
import java.util.List;


public class TestPatient {
    public static void main(String[] args)
    {
        List<Patient>  patients = new ArrayList<>();
        CreatData (patients);
        patients.sort(new ComparebyAGE());
        ShowHeader();
        patients.forEach(TestPatient::showData);
    }

    public static void ShowHeader(){
        System.out.printf("%-12s%-12s%-12s%-12s%-12s%-12s%-12s \n",
                "ID", "FirstName", "Name", "Birthday", "Gender", "Birthplace", "AGE");
    }


    public static void showData(Patient patient){
        System.out.printf("%-12s%-12s%-12s%-12s%-12s%-12s%-12.2f\n",
                patient.getID(), patient.getFirstName(), patient.getName(), patient.getBirthday(), patient.getGender(), patient.getBirthplace(), patient.getAGE());
    }

    public static void CreatData(List<Patient> patients){
        patients.add(new Patient("2020I1","Nguyen","Van","05/02/2003","Male","VietNam",18));
        patients.add(new Patient("2020I2","Kim","Jennie","04/03/2000","FeMale","Korea",21));
        patients.add(new Patient("2020I3","Vlad","Xasa","05/07/2002","Male","Russia",19));
    }
}