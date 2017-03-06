package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibrarianTest {


    @Test
    public void shouldReturnStatusOfBook() {
        Librarian lynda = new Librarian();
        Book book1 = new Book("One Flew Over the Cuckoo's Nest", "Ken Kesey", 1962);
        lynda.getBookRegister().put(book1, true);
        assertTrue(lynda.getBookRegister().get(book1));
    }

    @Test
    public void shouldChangeBookStatusWhenCheckedOut() {
        Librarian lynda = new Librarian();
        Book book1 = new Book("One Flew Over the Cuckoo's Nest", "Ken Kesey", 1962);
        lynda.getBookRegister().put(book1, true);
        lynda.checkoutBook(book1);
        assertFalse(lynda.getBookRegister().get(book1));
    }

    @Test
    public void shouldChangeBookStatusWhenReturningBook() {
        Librarian lynda = new Librarian();
        Book book1 = new Book("One Flew Over the Cuckoo's Nest", "Ken Kesey", 1962);
        lynda.getBookRegister().put(book1, true);
        lynda.checkoutBook(book1);
        lynda.returnBook(book1);
        assertTrue(lynda.getBookRegister().get(book1));
    }
}
