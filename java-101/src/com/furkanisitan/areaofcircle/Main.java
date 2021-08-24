package com.furkanisitan.areaofcircle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        int radius = scanner.nextInt();

        System.out.print("Enter the central angle: ");
        int angle = scanner.nextInt();

        double area = (Math.PI * Math.pow(radius, 2) * angle) / 360;

        System.out.printf("The area of the circle is %.2f units.\n", area);
    }
}
