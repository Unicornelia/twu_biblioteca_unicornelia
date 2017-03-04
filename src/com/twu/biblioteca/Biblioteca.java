package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String welcome = "Hello visitor, the Biblioteca is open!";
    private Librarian librarian;

    public Biblioteca() {
        librarian = new Librarian();
    }


    public String getWelcomeMessage() {return welcome;}

    public String printWelcome() {
        return welcome;
    }

    public List<Book> listBooks() {
        return librarian.getBookList();
    }

    public void listBooksFormatted() {
        for (int i = 0; i < listBooks().size(); i++) {
            System.out.println(listBooks().get(i));
        }
    }
}
