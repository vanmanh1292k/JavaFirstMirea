package ru.mirea.task13;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> states = new LinkedList<>();
        states.add("Germany");
        states.add("France");
        states.addLast("United Kingdom");
        states.addFirst("Spain");
        states.add(1, "Italy");
        System.out.printf("There are %d items in the list \n", states.size());
        System.out.println(states.get(1));
        states.set(1, "Denmark");
        for (String state : states) {

            System.out.println(state);
        }
        if (states.contains("Germany")) {

            System.out.println("The list contains the state of Germany");
        }

        states.remove("Germany");
        states.removeFirst();
        states.removeLast();

        LinkedList<Person> people = new LinkedList<>();
        people.add(new Person("Mike"));
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        people.remove(1);

        for (Person p : people) {

            System.out.println(p.getName());
        }
        Person first = people.getFirst();
        System.out.println(first.getName());
    }
}
class Person{

    private String name;
    public Person(String value){

        name=value;
    }
    String getName(){return name;}
}