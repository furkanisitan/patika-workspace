package com.furkanisitan.greengrocer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double pearPrice = 2.14, applePrice = 3.67, tomatoPrice = 1.11, bananaPrice = .95, auberginePrice = 5;

        System.out.print("Enter the weight of the pear(kg): ");
        int pearKg = scanner.nextInt();

        System.out.print("Enter the weight of the apple(kg): ");
        int appleKg = scanner.nextInt();

        System.out.print("Enter the weight of the tomato(kg): ");
        int tomatoKg = scanner.nextInt();

        System.out.print("Enter the weight of the banana(kg): ");
        int bananaKg = scanner.nextInt();

        System.out.print("Enter the weight of the aubergine(kg): ");
        int aubergineKg = scanner.nextInt();

        double totalPrice = pearPrice * pearKg + applePrice * appleKg + tomatoPrice * tomatoKg + bananaPrice * bananaKg + auberginePrice * aubergineKg;
        System.out.printf("The total price is %.2f\n", totalPrice);
    }
}
