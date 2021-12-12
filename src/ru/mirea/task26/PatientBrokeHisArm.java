package ru.mirea.task26;

public class PatientBrokeHisArm extends Patient {

    // The constructor initializes all objects

    public PatientBrokeHisArm(){

        super();

        // We set the Walk interface polymorphically
        // This sets the behavior as a non-walking Patient

        walkingType = new ItWalk();

    }

}