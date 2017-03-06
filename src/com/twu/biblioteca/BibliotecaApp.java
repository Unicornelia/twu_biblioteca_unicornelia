package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Menu menu = new Menu();

        biblioteca.printWelcome();
        int option = menu.intro();
        menu.menuOptions(option, biblioteca);
    }
}
