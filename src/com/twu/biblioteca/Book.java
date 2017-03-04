package com.twu.biblioteca;

public class Book {

    public boolean isAvailable;
    private String name;
    private String author;
    private int bookPublishDate;

    public Book(String name, String author, int bookPublishDate, boolean isAvailable) {
        this.name = name;
        this.author = author;
        this.bookPublishDate = bookPublishDate;
        this.isAvailable = isAvailable;
    }

    public String getName() {return this.name;}

    public boolean getAvailability() {return this.isAvailable;}

//    public String getAuthor() {return this.author;}

    public int getBookPublishDate() {return this.bookPublishDate;}

    @Override
    public String toString() {return "| Title: " + name + " | Author: " + author + " | Published: " + bookPublishDate + " |";}

}
