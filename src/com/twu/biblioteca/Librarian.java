package com.twu.biblioteca;


import java.util.ArrayList;
import java.util.List;

public class Librarian {

    private List<Book> bookList = new ArrayList<Book>();

    public Librarian() {
        bookList.add(new Book("In Search of Lost Time", "Marcel Proust", 1913, true));
        bookList.add(new Book("Don Quixote", "Miguel de Cervantes", 1612, true));
        bookList.add(new Book("Ulysses", "James Joyce", 1922, true));
        bookList.add(new Book("War and Peace", "Leo Tolstoy", 1869, true));
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public boolean isBookAvailable(Book book) {

        return book.isAvailable;
    }
}
