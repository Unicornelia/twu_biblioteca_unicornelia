package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;


public class Librarian {

    private List<Book> bookList = new ArrayList<Book>();

    public List<Book> listOfBooks() {
        bookList.add(new Book("In Search of Lost Time", "Marcel Proust", 1913));
        bookList.add(new Book("Don Quixote", "Miguel de Cervantes", 1612));
        bookList.add(new Book("Ulysses", "James Joyce", 1922));
        bookList.add(new Book("War and Peace", "Leo Tolstoy", 1869));
        return bookList;
    }


    public HashMap<Book, Boolean> bookRegister = new HashMap<Book, Boolean>();
    
    public Librarian() {
        bookRegister.put(new Book("In Search of Lost Time", "Marcel Proust", 1913), true);
        bookRegister.put(new Book("Don Quixote", "Miguel de Cervantes", 1612), true);
        bookRegister.put(new Book("Ulysses", "James Joyce", 1922), true);
        bookRegister.put(new Book("War and Peace", "Leo Tolstoy", 1869), true);
    }


    public HashMap<Book, Boolean> getBookRegister() {
        return bookRegister;
    }

    public void checkoutBook(Book book) {
        System.out.println(book.getName() + " has been checked out");
        bookRegister.put(book, false);
    }

    public void returnBook(Book book) {
        System.out.println(book.getName() + " has been returned");
        bookRegister.put(book, true);
    }
}
