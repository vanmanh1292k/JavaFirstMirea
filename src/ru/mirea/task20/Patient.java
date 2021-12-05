package ru.mirea.task20;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Patient {

    protected String sName;
    protected Date birthdate;

    // ==============================================================
    // Set/get name of a person
    // ==============================================================
    public void setName(String sName) {
        this.sName = sName;
    }

    public String getName() {
        return sName;
    }

    public int getAge() {

        Calendar today = Calendar.getInstance();
        Calendar birthday = new GregorianCalendar();
        birthday.setTime(birthdate);

        // Compute basic difference in years ....
        int yearDiff = today.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);

        // Birthday still needs to occur this year...
        if (today.get(Calendar.MONTH) < birthday.get(Calendar.MONTH)) {
            yearDiff = yearDiff - 1;
        } else if (today.get(Calendar.MONTH) == birthday.get(Calendar.MONTH)
                && today.get(Calendar.DATE) < birthday.get(Calendar.DATE)) {
            yearDiff = yearDiff - 1;
        }

        return yearDiff;
    }

    public void setBirthDate(int iYear, int iMonth, int iDay) {
        Calendar cal = Calendar.getInstance();
        cal.set(iYear, iMonth, iDay);
        this.birthdate = cal.getTime();
    }

    public Date getBirthDate() {
        return birthdate;
    }

    // ==========================================================
    // Create a String description of a persons credentials
    // ==========================================================
    public String toString() {
        String s = "Name: " + getName() + "\n";
        s += " Age: " + getAge() + "\n";
        return s;
    }

    // ==========================================================
    // Exercise methods in Person class ....
    // ==========================================================
    public static void main(String[] args) {

        // Create and print a patient object ...
        Patient homer = new Patient();
        homer.setName("Manh");
        homer.setBirthDate(2000, Calendar.SEPTEMBER, 12);
        System.out.println(homer);

    }
}