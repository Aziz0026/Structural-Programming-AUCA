package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x;
        float y, liters;

        Scanner scanner = new Scanner(System.in);

        x = scanner.nextInt();
        y = scanner.nextFloat();

        liters = x / y;

        System.out.printf("%.3f km/l\n", liters);
    }
}
