package com.furkanisitan.sortnumbers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Enter num1: ");
        num1 = scanner.nextInt();

        System.out.print("Enter num2: ");
        num2 = scanner.nextInt();

        System.out.print("Enter num3: ");
        num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            if (num2 > num3)
                System.out.println("num1 > num2 > num3");
            else
                System.out.println("num1 > num3 > num2");

        } else if (num2 > num1 && num2 > num3) {
            if (num1 > num3)
                System.out.println("num2 > num1> num3");
            else
                System.out.println("num2 > num3 > num1");
        } else {
            if (num1 > num2)
                System.out.println("num3 > num1> num2");
            else
                System.out.println("num3 > num2 > num1");
        }
    }
}
