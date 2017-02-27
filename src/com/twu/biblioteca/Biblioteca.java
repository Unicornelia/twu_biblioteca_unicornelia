package com.twu.biblioteca;

public class Biblioteca {

    public String printWelcome() {
        String welcome = "Hello visitor, the Biblioteca is open!";
        return welcome;
    }

    public String listBooks() {
        String[] bookList = {"In Search of Lost Time", "Don Quixote", "Ulysses", "War and Peace", "The Odyssey", "The Divine Comedy"};
        for (int i = 0; i < bookList.length; i++) {
            return bookList[i];
        }
    }
}
