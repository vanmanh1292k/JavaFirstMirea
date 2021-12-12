package ru.mirea.task25;

public class main {
    public static void main(String[] args){
        HospitalsFee simpleHospitalsFee  = new SimpleHospitalFees();
        System.out.printf("Ingredient: %s %nCost: %s.2f", simpleHospitalsFee.getIngredients(), simpleHospitalsFee.getCost());

        HospitalsFee hospitalFeesWithInsuranceCard  = new HospitalFeesWithInsuranceCard(new SimpleHospitalFees());
        System.out.printf("%nIngredient: %s %nCost: %s.2f", hospitalFeesWithInsuranceCard.getIngredients(), hospitalFeesWithInsuranceCard.getCost());

        HospitalsFee hospitalFeesWithoutInsuranceCard  = new HospitalFeesWithoutInsuranceCard(new SimpleHospitalFees());
        System.out.printf("%nIngredient: %s %nCost: %s.2f", hospitalFeesWithoutInsuranceCard.getIngredients(), hospitalFeesWithoutInsuranceCard.getCost());
    }
}
