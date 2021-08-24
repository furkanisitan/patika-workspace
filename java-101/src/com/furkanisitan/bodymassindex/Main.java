package com.furkanisitan.bodymassindex;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Your Height(m): ");
        double height = scanner.nextDouble();

        System.out.print("Your Weight(kg): ");
        int weight = scanner.nextInt();

        double index = weight / Math.pow(height, 2.0);
        System.out.printf("Your body mass index is %.2f.\n", index);
    }
}
