package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class LibrarianTest {


    @Test
    public void shouldReturnStatusOfBook() {
        Librarian lynda = new Librarian();
        Book book1 = new Book("One Flew Over the Cuckoo's Nest", "Ken Kesey", 1962);
        lynda.getBookRegister().put(book1, true);
        assertTrue(lynda.getBookRegister().get(book1));
    }
}
