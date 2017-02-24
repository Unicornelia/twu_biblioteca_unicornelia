package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {

        Biblioteca first = new Biblioteca();
        Biblioteca second = new Biblioteca();

        System.out.println(first.printWelcome());
        System.out.println(second.listBooks());

    }
}

