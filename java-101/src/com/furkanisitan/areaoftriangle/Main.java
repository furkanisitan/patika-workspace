package com.furkanisitan.areaoftriangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
         * u = (a + b + c) / 2
         * area = ( u * (u - a) * (u - b) * (u - c) ) ^ .5
         * */

        Scanner scanner = new Scanner(System.in);

        System.out.print("1st side length: ");
        int side1 = scanner.nextInt();

        System.out.print("2nd side length: ");
        int side2 = scanner.nextInt();

        System.out.print("3rd side length: ");
        int side3 = scanner.nextInt();

        double u = (side1 + side2 + side3) / 2.0;
        double area = Math.sqrt(u * (u - side1) * (u - side2) * (u - side3));

        System.out.printf("The area of the triangle is %.2f units.\n", area);
    }
}
