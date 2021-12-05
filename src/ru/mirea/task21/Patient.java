package ru.mirea.task21;

import java.util.Objects;

public class Patient {
    private String ID;
    private String FirstName;
    private String Name;
    private String Birthday;
    private String Gender;
    private String Birthplace;
    private float AGE;

    public Patient(String ID, String FirstName, String Name, String Birthday, String Gender, String Birthplace, float AGE )
    {
        this.ID = ID;
        this.FirstName = FirstName;
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

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
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

    public float getAGE() {
        return AGE;
    }

    public void setAGE(float AGE) {
        this.AGE = AGE;
    }


    public void setBirthplace(String birthplace) {
        Birthplace = birthplace;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Float.compare(patient.AGE,AGE) == 0 && Objects.equals(ID, patient.ID) && Objects.equals(FirstName, patient.FirstName) && Objects.equals(Name, patient.Name) && Objects.equals(Birthday, patient.Birthday) && Objects.equals(Gender, patient.Gender) && Objects.equals(Birthplace, patient.Birthplace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, FirstName, Name, Birthday, Gender, Birthplace, AGE);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "ID='" + ID + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", Name='" + Name + '\'' +
                ", Birthday='" + Birthday + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Birthplace='" + Birthplace + '\'' +
                ", AGE=" + AGE +
                '}';
    }
}
