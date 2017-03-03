package com.twu.biblioteca;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class BibliotecaTest {


    @Test
    public void testWelcomeString() {
        Biblioteca biblioteca = new Biblioteca();
        assertEquals("Hello visitor, the Biblioteca is open!", biblioteca.printWelcome());
    }

    @Test
    public void testListOfBooks() {
        Biblioteca biblioteca = new Biblioteca();
        String[] expectedBookList = {"In Search of Lost Time", "Don Quixote", "Ulysses", "War and Peace", "The Odyssey", "The Divine Comedy"};
        assertArrayEquals(expectedBookList, biblioteca.listBooks());
    }

//    @Test
//    public void printMenu() {
//        Menu menu = new Menu();
//        Biblioteca biblioteca = new Biblioteca();
//        void answer = menu.menuOptions(2);
//        assertEquals("Option 2", answer);
//    }
}
