package ru.mirea.task3.Human;

public class Human {
    private Hand h;
    private Leg l;
    private Head hd;

    Human(Hand h, Leg l, Head hd) {
        this.h = h;
        this.l = l;
        this.hd = hd;
    }

    @Override
    public String toString() {
        return "Human has " + hd.toString() + " , " + h.toString() + " , " + l.toString();
    }
}
