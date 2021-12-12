package ru.mirea.task25;

public class HospitalFeesWithoutInsuranceCard extends HospitalsFeeDecorator{

    public HospitalFeesWithoutInsuranceCard(HospitalsFee hospitalsFee){
        super(hospitalsFee);
    }

    @Override
    public double getCost() {
        return super.getCost() * 1.1; // 10% tax
    }

    @Override
    public  String getIngredients(){
        return super.getIngredients() + " not insurance card";
    }
}
