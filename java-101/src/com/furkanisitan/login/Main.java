package com.furkanisitan.login;

import java.util.Scanner;

public class Main {

    private static final String USERNAME = "furkanisitan";
    private static final String PASSWORD = "1234";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String username, password, wrongPassword, reset;

        System.out.print("Enter username: ");
        username = scanner.next();

        if (!username.equals(USERNAME)) {
            System.out.println("Username is incorrect.");
            return;
        }

        System.out.print("Enter password: ");
        password = scanner.next();

        if (password.equals(PASSWORD)) {
            System.out.println("Signed in.");
            return;
        }

        wrongPassword = password;
        System.out.print("Password is incorrect! Do you want to reset the password? (y/n): ");

        reset = scanner.next();
        if (reset.equals("y")) {
            System.out.print("Enter new password: ");
            password = scanner.next();
            if (password.equals(PASSWORD) || password.equals(wrongPassword))
                System.out.println("Could not create password, please enter another password.");
            else
                System.out.println("Password created.");
        }

    }
}
