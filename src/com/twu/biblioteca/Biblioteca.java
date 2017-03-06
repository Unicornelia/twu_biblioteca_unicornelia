package com.twu.biblioteca;

import java.util.List;

public class Biblioteca {

    private String welcome = "Hello visitor, the Biblioteca is open!";
    private Librarian librarian;

    public Biblioteca() {
        librarian = new Librarian();
    }

    public void printWelcome() {
        System.out.println(welcome);
        System.out.println("");
    }

    public String getWelcome() {return welcome;}

    public List<Book> getBookList() { return librarian.listOfBooks(); }



    public void listBooksFormatted() {
        List<Book> alternativeList = getBookList();
        for (int i = 0; i < alternativeList.size(); i++) {
            System.out.println(alternativeList.get(i));
        }
    }
}
