package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        System.out.println(biblioteca.printWelcome());
        System.out.println("");

        biblioteca.listBooks();
        biblioteca.listBooksFormatted();
    }
}

