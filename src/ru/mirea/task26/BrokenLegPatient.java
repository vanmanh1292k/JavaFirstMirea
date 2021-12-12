package ru.mirea.task26;

public class BrokenLegPatient extends Patient {

    public BrokenLegPatient(){

        super();


        // We set the Walk interface polymorphically
        // This sets the behavior as a non-walking Patient

        walkingType = new CantWalk();

    }

}