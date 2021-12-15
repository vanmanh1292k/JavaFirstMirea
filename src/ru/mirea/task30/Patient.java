package ru.mirea.task30;


public class Patient {
    private String ID;
    private String Name;
    private String Birthday;
    private String Gender;
    private int AGE;
    private int NumberOfDays;
    private boolean HaveInsuranceCard;

    public Patient(String ID, String Name, String Birthday, String Gender, int AGE, int NumberOfDays, boolean HaveInsuranceCard) {
        this.ID = ID;
        this.Name = Name;
        this.Birthday = Birthday;
        this.Gender = Gender;
        this.AGE = AGE;
        this.NumberOfDays = NumberOfDays;
        this.HaveInsuranceCard = HaveInsuranceCard;
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

    public boolean getHaveInsuranceCard(){
        return HaveInsuranceCard;
    }

    public void setHaveInsuranceCard(boolean HaveInsuranceCard) {
        this.HaveInsuranceCard = HaveInsuranceCard;
    }

    public int getHospitalsFee(){
        int hospitalFee1Day = 2000;
        int totalHospitalFees = NumberOfDays * hospitalFee1Day;
        if(!HaveInsuranceCard){
            return totalHospitalFees;
        }
        else {
            return totalHospitalFees / 2;
        }

    }

    @Override
    public String toString() {
        return "Patient{" +
                "ID='" + ID + '\'' +
                ", Name='" + Name + '\'' +
                ", Birthday='" + Birthday + '\'' +
                ", Gender='" + Gender + '\'' +
                ", AGE=" + AGE +
                ", NumberOfDays=" + NumberOfDays +
                ", HaveInsuranceCard=" + HaveInsuranceCard +
                '}';
    }
}
