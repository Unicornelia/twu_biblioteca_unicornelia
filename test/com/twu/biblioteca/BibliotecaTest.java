package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BibliotecaTest {

    @Test
    public void test() {
        assertEquals(1, 1);
    }

    @Test
    public void testWelcomeString() {
        Biblioteca firstTask = new Biblioteca();
        assertEquals("Hello visitor, the Biblioteca is open!", firstTask.printWelcome());
    }

    @Test
    public void testListOfBooks() {
        Biblioteca secondTask = new Biblioteca();
        String[] expectedBookList = {"In Search of Lost Time", "Don Quixote", "Ulysses", "War and Peace", "The Odyssey", "The Divine Comedy"};
        assertArrayEquals(expectedBookList, secondTask.listBooks());
    }
}
