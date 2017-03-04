package com.twu.biblioteca;


import java.util.ArrayList;
import java.util.List;

public class Librarian {

    private List<Book> bookList = new ArrayList<Book>();

    public Librarian() {
        bookList.add(new Book("In Search of Lost Time", "A", 1913));
        bookList.add(new Book("Don Quixote", "B", 1612));
        bookList.add(new Book("Ulysses", "C", 1913));
        bookList.add(new Book("War and Peace", "D", 1913));
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public boolean isBookAvailable(Book book) {

        return false;
    }
}
