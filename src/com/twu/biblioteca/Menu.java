package com.twu.biblioteca;

import java.util.Scanner;

public class Menu {

public int intro() {
    System.out.println("Enter option from menu: ");
    System.out.println(" ");
    System.out.println("Option 1: List Books");
    System.out.println("Option 2: Checkout Book");
    System.out.println("Option 3: Return Book");
    System.out.println("Option 4: Quit");

    Scanner n = new Scanner(System.in);
    int answer = n.nextInt();
    return answer;

}

public void menuOptions(int answer, Biblioteca biblioteca) {

    switch (answer) {
            case 1:
                System.out.println("Available books in the library:");
                System.out.println(" ");
                biblioteca.listBooksFormatted();
                break;
            case 2:
                System.out.println("You are about to Checkout a Book");
                System.out.println("Which book do you choose? (enter a number)");

                break;
            case 3:
                System.out.println("You are about to Return a Book");
                System.out.println("Which book are you returning? (enter a number)");

                break;
            case 4:
                System.out.println("GoodBye!");
                break;
            default:
                System.out.println("Invalid option!");
                break;
        }
    }
}

