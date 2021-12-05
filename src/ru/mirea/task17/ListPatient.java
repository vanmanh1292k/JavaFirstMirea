package ru.mirea.task17;

public enum ListPatient {
    // define enum with 3 variable
    STUDENT_001("001", "Alex","20-10-2003", "Male","NewYork"),
    STUDENT_002("002", "Jennie","03-03-2003" ,"Female","Korea"),
    STUDENT_003("003", "Jimmy","05-02-2003", "Male","Russia");

    private String ID;
    private String Name;
    private String Birthday;
    private String Gender;
    private String Birthplace;

    private ListPatient(String ID, String Name,String Birthday, String Gender, String Birthplace) {
        this.ID = ID;
        this.Name = Name;
        this.Birthday = Birthday;
        this.Gender = Gender;
        this.Birthplace = Birthplace;
    }

    // getter & setter
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    public String getGender (){
        return Gender;
    }

    public void setGender(String Gender){
        this.Gender = Gender;
    }

    public String getBirthplace() {
        return Birthplace;
    }

    public void setBirthplace(String birthplace) {
        Birthplace = birthplace;
    }
}