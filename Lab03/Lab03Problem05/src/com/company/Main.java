package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x;
        String grade;

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of points? ");
        x = sc.nextInt();

        if (x > 100) {
            System.out.println(x + " is not in the permitted range.");
        } else {
            if (90 <= x) {
                grade = "A";
            } else if (80 <= x) {
                grade = "B";
            } else if (70 <= x) {
                grade = "C";
            } else if (60 <= x) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.println("Grade: " + grade);

        }

    }
}
