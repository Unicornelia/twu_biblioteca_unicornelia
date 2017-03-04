package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String welcome = "Hello visitor, the Biblioteca is open!";
    List<Book> bookList = new ArrayList<Book>();


    public Biblioteca() {
        bookList.add(new Book("In Search of Lost Time", 1913));
        bookList.add(new Book("Don Quixote", 1612));
        bookList.add(new Book("Ulysses", 1913));
        bookList.add(new Book("War and Peace", 1913));
    }

    public String getWelcomeMessage() {return welcome;}

    public String printWelcome() {
        return welcome;
    }

    public List<Book> listBooks() {
        return bookList;
    }

    public void listBooksFormatted() {
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i));
        }
    }
}
