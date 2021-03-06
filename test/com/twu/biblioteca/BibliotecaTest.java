package com.twu.biblioteca;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BibliotecaTest {

    @Test
    public void testWelcomeString() {
        Biblioteca biblioteca = new Biblioteca();
        assertEquals("Hello visitor, the Biblioteca is open!", biblioteca.getWelcome());
    }

    @Test
    public void testTitleOfBooksInList() {
        Biblioteca biblioteca = new Biblioteca();
        assertEquals("In Search of Lost Time", biblioteca.getBookList().get(0).getName());
        assertEquals("Don Quixote", biblioteca.getBookList().get(1).getName());
    }

    @Test
    public void testPublishDateOfBooksInList() {
        Biblioteca biblioteca = new Biblioteca();
        assertEquals(1913, biblioteca.getBookList().get(0).getBookPublishDate());
        assertEquals(1612, biblioteca.getBookList().get(1).getBookPublishDate());
    }
}
