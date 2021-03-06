package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;


public class BookTest {

    @Test
    public void shouldPrintFormattedBook() {
        Book testBook = new Book("The Very Hungry Caterpillar", "Eric Carle",1913);
        String expected = "| Title: The Very Hungry Caterpillar | Author: Eric Carle | Published: 1913 |";
        assertEquals(expected, testBook.toString());
    }
}