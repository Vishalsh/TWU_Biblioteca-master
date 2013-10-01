package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    Library library = new Library();

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        String check = "yes";
        while(check.equals("yes")) {
            System.out.println("WELCOME TO BIBLIOTECA");
            System.out.println("Select your option");
            System.out.println("(1) To view the list of all books   (2) to reserve a book   (3) to get membership details (4) to get the list of all movies  (5) to log in");
            System.out.println(bibliotecaApp.library.getFunctionalityDone(sc.nextInt()));
            System.out.println("Do you want to perform some other function?(yes or no)");
            check = sc.next();
        }
    }
}
