package ru.mirea.task2.Book;

public class Book {
    private String author;
    private int year;
    private String nameOfBook;

    public Book() {
        author = "None";
        year = 2021;
        nameOfBook = "None";
    }
    public Book(String author, int year, String nameOfBook) {
        this.author = author;
        this.year = year;
        this.nameOfBook = nameOfBook;
    }
    public Book(String author, String nameOfBook) {
        this.author = author;
        this.nameOfBook = nameOfBook;
        this.year = 2021;
    }
    public int getYear() {
        return year;
    }
    public String getAuthor() {
        return author;
    }
    public String getNameOfBook() {
        return nameOfBook;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }
    public String toString() {
        return this.nameOfBook + " of " + this.author + " is published in " + this.year;
    }
}
