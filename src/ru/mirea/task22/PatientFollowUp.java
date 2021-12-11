package ru.mirea.task22;
//subclass
public class PatientFollowUp extends Patient {
    private String ID;
    private String Name;
    private String Birthday;
    private String Gender;
    private String Birthplace;
    private int AGE;

    public PatientFollowUp(String ID, String Name,String Birthday, String Gender, String Birthplace, int AGE) {
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

    public String getName() {
        return Name;
    }

    public String getBirthday() {
        return Birthday;
    }

    public String getGender() {
        return Gender;
    }

    public String getBirthplace() {
        return Birthplace;
    }

    public int getAGE() {
        return AGE;
    }
}