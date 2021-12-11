package ru.mirea.task23;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ListPatient {
    private ArrayList<Patient> ds;

    public ListPatient(){
        this.ds = new ArrayList<Patient>();
    }

    public ListPatient(ArrayList<Patient> ds){
        this.ds = ds;
    }

    // Add patients to the list.
    public void ADD_patient(Patient st){
        this.ds.add(st);
    }

    //Print the list of patients to the screen.
    public void Output_ListPatient(){
        for (Patient patient : ds){
            System.out.println(patient);
        }
    }

    //Check if the list is empty or not.
    public boolean Check_EmptyList(){
        return this.ds.isEmpty();
    }

    //Get the number of patients on the list.
    public int Number_ListPatient(){
        return this.ds.size();
    }

    //Check if a patient exists in the list, based on the patient ID.
    public boolean Check_ID(Patient st){
        return this.ds.contains(st);
    }

    //Remove a patient from the list based on the patient ID.
    public boolean Remove_ID(Patient st){
        return this.ds.remove(st);
    }

    //Search all patient based on Name entered from keyboard.
    public void Find_Patient(String name){
        for(Patient patient : ds){
            if(patient.getName().contains(name)){
                System.out.println(patient);
            }
        }
    }

    //Output a list of patients with high to low scores.
    public void Sort_ListPatient(){
        Collections.sort(this.ds, new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                if(o1.getAGE() < o2.getAGE()) return 1;
                else if (o1.getAGE() > o2.getAGE()) return -1;
                else return 0;
            }
        });
    }
}
