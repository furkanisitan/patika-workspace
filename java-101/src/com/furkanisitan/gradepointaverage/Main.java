package com.furkanisitan.gradepointaverage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int math, physics, chemistry, turkish, history, music;

        System.out.print("Enter your math grade: ");
        math = scanner.nextInt();

        System.out.print("Enter your physics grade: ");
        physics = scanner.nextInt();

        System.out.print("Enter your chemistry grade: ");
        chemistry = scanner.nextInt();

        System.out.print("Enter your turkish grade: ");
        turkish = scanner.nextInt();

        System.out.print("Enter your history grade: ");
        history = scanner.nextInt();

        System.out.print("Enter your music grade: ");
        music = scanner.nextInt();

        int totalGrade = math + physics + chemistry + turkish + history + music;
        double averageOfGrades = totalGrade / 6.0;

        System.out.printf("Your GPA is %f\n", averageOfGrades);
        System.out.printf("You %s the class.", averageOfGrades >= 60 ? "passed" : "failed");
    }

}
