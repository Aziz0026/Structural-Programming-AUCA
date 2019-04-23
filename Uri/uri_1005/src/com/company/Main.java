package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float a, b, average;

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextFloat();
        b = scanner.nextFloat();

        average = (float) (((a * 3.5) + (b * 7.5)) / (3.5 + 7.5));

        System.out.printf("MEDIA = %.5f\n", average);
    }
}
