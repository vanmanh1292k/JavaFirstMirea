package ru.mirea.task25;

public class HospitalFeesWithInsuranceCard extends HospitalsFeeDecorator{

    public HospitalFeesWithInsuranceCard(HospitalsFee hospitalsFee){
        super(hospitalsFee);
    }

    @Override
    public  double getCost(){
        return super.getCost() / 2.0;
    }

    @Override
    public String getIngredients(){
        return super.getIngredients() + " + insurance card";
    }
}
