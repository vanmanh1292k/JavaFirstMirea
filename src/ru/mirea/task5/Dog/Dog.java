package ru.mirea.task5.Dog;

public abstract class Dog {
    private String origin;
    private Double height;
    private Double weight;

    public Dog(String origin, Double height, Double weight){
        this.origin = origin;
        this.height = height;
        this.weight = weight;
    }
    public void setOrigin(String origin){
        this.origin = origin;
    }

    public void setHeight(Double height){
        this.height = height;
    }

    public void setWeight(Double weight){
        this.weight = weight;
    }
    public String getOrigin() {
        return origin;
    }
    public Double getHeight(){
        return height;
    }

    public Double getWeight() {
        return weight;
    }

    public abstract void bark();
}
