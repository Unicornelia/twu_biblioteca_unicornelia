package com.twu.biblioteca;

public class Book {

    private String name;
    private int bookPublishDate;

    public Book(String name, int bookPublishDate) {
        this.name = name;
        this.bookPublishDate = bookPublishDate;
    }

    public String getName() {return this.name;}

    public int getBookPublishDate() {return this.bookPublishDate;}

    @Override
    public String toString() {return name.toString();}

}
