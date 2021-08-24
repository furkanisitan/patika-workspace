package com.furkanisitan.hackerrank.javaifelse;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (n % 2 == 1)
            System.out.print("Weird");
        else {
            if ((n >= 2 && n <= 5) || n > 20)
                System.out.print("Not Weird");
            else if (n >= 6)
                System.out.print("Weird");
        }

        scanner.close();
    }
}
