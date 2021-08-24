package com.furkanisitan.passtheclass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int math, physics, chemistry, turkish, music;
        double passGrade = 55, lessonCount = 0;

        System.out.print("Enter your math grade: ");
        math = scanner.nextInt();
        if (math >= 0 && math <= 100) lessonCount++;
        else math = 0;

        System.out.print("Enter your physics grade: ");
        physics = scanner.nextInt();
        if (physics >= 0 && physics <= 100) lessonCount++;
        else physics = 0;

        System.out.print("Enter your chemistry grade: ");
        chemistry = scanner.nextInt();
        if (chemistry >= 0 && chemistry <= 100) lessonCount++;
        else chemistry = 0;

        System.out.print("Enter your turkish grade: ");
        turkish = scanner.nextInt();
        if (turkish >= 0 && turkish <= 100) lessonCount++;
        else turkish = 0;

        System.out.print("Enter your music grade: ");
        music = scanner.nextInt();
        if (music >= 0 && music <= 100) lessonCount++;
        else music = 0;

        int totalGrade = math + physics + chemistry + turkish + music;
        double averageOfGrades = lessonCount > 0 ? totalGrade / lessonCount : 0;

        System.out.printf("Your GPA is %.2f\n", averageOfGrades);
        System.out.printf("You %s the class.", averageOfGrades >= passGrade ? "passed" : "failed");
    }
}
