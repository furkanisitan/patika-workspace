package com.furkanisitan.taximeter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double minCharge = 20, initialCharge = 10, kmCharge = 2.2;

        System.out.print("Enter kilometers: ");
        int km = scanner.nextInt();

        double charge = initialCharge + kmCharge * km;
        System.out.printf("Taximeter fee is %.2f.", Math.max(minCharge, charge));
    }
}
