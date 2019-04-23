package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double x, kilo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");
        x = sc.nextDouble();

        kilo = x / 2.20;

        System.out.printf("%.1f pounds is %.3f kilograms\n", x, kilo);
    }
}
