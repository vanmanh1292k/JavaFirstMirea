package ru.mirea.task5.Dog;

public class Husky extends Dog {
    public Husky(String origin, Double height, Double weight){
        super(origin, height, weight);
    }

    @Override
    public void bark(){
        System.out.println("Woof woof");
    }

    @Override
    public String toString(){
        return "This husky comes from " + this.getOrigin() + ", and is " + this.getHeight() + "cm tall " + "and " + this.getWeight() + "kg";
    }
}
