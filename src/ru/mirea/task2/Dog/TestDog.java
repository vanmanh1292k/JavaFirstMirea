package ru.mirea.task2.Dog;

public class TestDog {
    public static void main(String [] args) {
        Dog d1 = new Dog("Mike", 2);
        Dog d2 = new Dog("Helen");
        Dog d3 = new Dog();
        d3.setAge(3);
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());
        System.out.println(d1.intoHumanAge());
        System.out.println(d2.intoHumanAge());
        System.out.println(d3.intoHumanAge());
    }
}
