package com.twu.biblioteca;

public class Biblioteca {

    private String welcome = "Hello visitor, the Biblioteca is open!";
    private String[] bookList = {"In Search of Lost Time", "Don Quixote", "Ulysses", "War and Peace", "The Odyssey", "The Divine Comedy"};

    public String getWelcomeMessage() {return welcome;}

    public String printWelcome() {
        return welcome;
    }

    public String[] listBooks() {
        return bookList;
    }

    public void listBooksFormatted() {
        for (int i = 0; i < bookList.length; i++) {
            System.out.println(bookList[i]);
        }
    }
}
