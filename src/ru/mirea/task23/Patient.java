package ru.mirea.task23;

import java.util.Objects;

public class Patient implements Comparable<Patient> {
    private String ID;
    private String Name;
    private String Birthday;
    private String Gender;
    private String Birthplace;
    private int AGE;

    public Patient(String ID){
        this.ID =ID;
    }

    public Patient(String ID, String Name, String Birthday, String Gender, String Birthplace, int AGE )
    {
        this.ID = ID;
        this.Name = Name;
        this.Birthday = Birthday;
        this.Gender = Gender;
        this.Birthplace = Birthplace;
        this.AGE = AGE;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getBirthplace() {
        return Birthplace;
    }

    public void setBirthplace(String birthplace) {
        Birthplace = birthplace;
    }

    public int getAGE() {
        return AGE;
    }

    public void setAGE(int AGE) {
        this.AGE = AGE;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "ID='" + ID + '\'' +
                ", Name='" + Name + '\'' +
                ", Birthday='" + Birthday + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Birthplace='" + Birthplace + '\'' +
                ", AGE=" + AGE +
                '}';
    }


    @Override
    public int compareTo(Patient o) {
        return this.ID.compareTo(o.ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return  Objects.equals(ID, patient.ID);
    }
    //compare patients

    @Override
    public int hashCode() {
        return Objects.hash(ID, Name, AGE);
    }
}
