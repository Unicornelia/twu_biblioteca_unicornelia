package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;


public class Librarian {

    private List<Book> bookList = new ArrayList<Book>();

    public List<Book> getListOfBooksFromRegister() {
        for (Book book: bookRegister.keySet()) {
            bookList.add(book);
        }
        return bookList;
    }

    public List<Book> bookList() {
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
//
//    public boolean isBookAvailable(Book book) {
//        return true;
//    }
//
//    public void checkoutBook(Book book) {
//        System.out.println("Book has been checked out");
//    }
}
