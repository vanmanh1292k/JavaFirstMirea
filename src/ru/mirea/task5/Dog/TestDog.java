package ru.mirea.task5.Dog;

public class TestDog {
    public static void main(String[] args) {
        Husky h1 = new Husky("Siberia", 25.0, 55.5);
        System.out.println(h1);
        h1.bark();
    }
}