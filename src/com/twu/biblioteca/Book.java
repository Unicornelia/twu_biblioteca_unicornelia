package com.twu.biblioteca;

public class Book {

    private String name;
    private String author;
    private int bookPublishDate;

    public Book(String name, String author, int bookPublishDate) {
        this.name = name;
        this.author = author;
        this.bookPublishDate = bookPublishDate;
    }

    public String getName() {return this.name;}

    public int getBookPublishDate() {return this.bookPublishDate;}

    @Override
    public String toString() {return "| Title: " + name + " | Author: " + author + " | Published: " + bookPublishDate + " |";}

}
