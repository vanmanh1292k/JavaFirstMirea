package ru.mirea.task4.Author;

public class TestAuthor {
    public static void main(String [] args) {
        Author a1 = new Author("Anna Ivanova", "AnnaInvanova@mirea.ru", 'F');
        Author a2 = new Author("Sergei Petrov", "sergeipetr@gmail.com", 'M');
        Author a3 = new Author("Van Manh", "ngvmanh129@gmail.com", 'M');

        System.out.println(a1);
        System.out.println(a1.getName() + " has email " + a1.getEmail());
        System.out.println(a2);

        a3.setEmail("vanmanh@mirea.ru");
        System.out.println(a3);
    }
}