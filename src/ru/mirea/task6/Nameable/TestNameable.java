package ru.mirea.task6.Nameable;

public class TestNameable {
    public static void main(String[] args) {
        Nameable n1 = new Car("Mercedes");
        n1.getName();

        n1 = new Plane("Su-57");
        n1.getName();

        Plane p1 = new Plane("Boeing 747");
        p1.getName();
    }
}
