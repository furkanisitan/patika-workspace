package com.furkanisitan.suggestingevents;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int temperature;

        System.out.print("Enter a temperature: ");
        temperature = scanner.nextInt();

        if (temperature < 5) System.out.println("You can go skiing.");
        else if (temperature > 25) System.out.println("You can go swimming.");
        else {
            if (temperature <= 15) System.out.println("You can go to the cinema.");
            if (temperature >= 10) System.out.println("You can go for a picnic.");
        }

    }
}
