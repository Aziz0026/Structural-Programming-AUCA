package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float a, b, c, average;

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();

        average = (((a * 2) + (b * 3) + (c * 5)) / (2 + 3 + 5));

        System.out.printf("MEDIA = %.1f\n", average);
    }
}