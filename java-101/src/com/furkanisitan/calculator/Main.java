package com.furkanisitan.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1, number2, operation;

        System.out.println("Enter a operation number.");
        System.out.println("1 => addition");
        System.out.println("2 => extraction");
        System.out.println("3 => multiplication");
        System.out.println("4 => division");

        operation = scanner.nextInt();

        System.out.print("Enter the 1st number: ");
        number1 = scanner.nextInt();

        System.out.print("Enter the 2nd number: ");
        number2 = scanner.nextInt();

        switch (operation) {
            case 1:
                System.out.println(number1 + number2);
                break;
            case 2:
                System.out.println(number1 - number2);
                break;
            case 3:
                System.out.println(number1 * number2);
                break;
            case 4:
                if (number2 == 0) {
                    System.out.println("It cannot be divided by zero.");
                } else {
                    System.out.println((double) number1 / number2);
                }
                break;
            default:
                System.out.println("Invalid operation!");
                break;
        }

    }
}
