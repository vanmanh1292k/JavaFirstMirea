package ru.mirea.task25;

public abstract class HospitalsFeeDecorator implements HospitalsFee {

    private HospitalsFee hospitalsFee;

    public HospitalsFeeDecorator(HospitalsFee hospitalsFee){
        this.hospitalsFee = hospitalsFee;
    }

    @Override
    public double getCost(){
        return hospitalsFee.getCost();
    }

    @Override
    public String getIngredients(){
        return hospitalsFee.getIngredients();
    }

}
