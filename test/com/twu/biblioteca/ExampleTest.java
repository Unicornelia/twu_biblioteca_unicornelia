package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTest {

    @Test
    public void test() {
        assertEquals(1, 1);
    }

    @Test
    public void expectWelcomeString() {
        Biblioteca firstMessage = new Biblioteca();
        assertEquals("Hello visitor, the Biblioteca is open!", firstMessage.printWelcome());
    }
}
