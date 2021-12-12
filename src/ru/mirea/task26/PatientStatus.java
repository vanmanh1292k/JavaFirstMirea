package ru.mirea.task26;

public class PatientStatus {

    public static void main(String[] args){

        Patient patient1 = new Patient("001", "Jennie ", "20-10-2003","Female",15);
        Patient patient2 = new Patient("002", "Wang ", "21-11-1995","male",26);

        Patient st1 = new BrokenLegPatient();
        Patient st2 = new PatientBrokeHisArm();

        System.out.println(patient1.getName() + st1.tryToWalk());

        System.out.println(patient2.getName() + st2.tryToWalk());

        // This allows dynamic changes for walkingType

        st1.setWalkingAbility(new ItWalk());

        System.out.println(patient1.getName() + st1.tryToWalk());

    }

}