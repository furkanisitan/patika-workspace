package com.furkanisitan.valueaddedtax;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a price: ");
        int price = scanner.nextInt();

        float vatRate = price > 1000 ? .08f : .18f;
        float vatAmount = price * vatRate;

        System.out.printf("VAT rate: %%%d\n", (int) (vatRate * 100));
        System.out.printf("VAT amount: %.2f\n", vatAmount);
        System.out.printf("Amount with VAT: %.2f\n", price + vatAmount);
    }

}
