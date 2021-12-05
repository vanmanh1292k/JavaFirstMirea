package ru.mirea.task21;
import java.util.Comparator;

public class ComparebyAGE implements Comparator<Patient> {

    @Override
    public int compare(Patient o1, Patient o2) {
        var gpaCompare = Float.compare(o2.getAGE(), o1.getAGE());
        if (gpaCompare != 0) {
            return gpaCompare;
        } else
        {
            var nameCompare = o1.getFirstName().compareTo(o2.getFirstName());
            if (nameCompare != 0) return nameCompare;
            else return o1.getName().compareTo(o2.getName());
        }
    }
}
