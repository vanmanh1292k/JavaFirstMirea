package ru.mirea.task25;

public class SimpleHospitalFees implements HospitalsFee {

    @Override
    public double getCost(){
        return 6.5;
    }


    @Override
    public String getIngredients(){
        return "Hospital's fee";
    }

}
