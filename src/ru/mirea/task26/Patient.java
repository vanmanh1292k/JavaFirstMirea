package ru.mirea.task26;

public class Patient {

    private String ID;
    private String Name;
    private String Birthday;
    private String Gender;
    private int AGE;

    public Walk walkingType;

    public Patient(String ID, String Name, String Birthday, String Gender, int AGE) {
        this.ID = ID;
        this.Name = Name;
        this.Birthday = Birthday;
        this.Gender = Gender;
        this.AGE = AGE;
    }

    public Patient() {

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

    public int getAGE() {
        return AGE;
    }

    public void setAGE(int AGE) {
        this.AGE = AGE;
    }


    // Patient pushes off the responsibility for walking to walkingType

    public String tryToWalk(){

        return walkingType.walk();

    }

    // If you want to be able to change the walkingType dynamically
    // add the following method

    public void setWalkingAbility(Walk newWalkType){

        walkingType = newWalkType;

    }

}
