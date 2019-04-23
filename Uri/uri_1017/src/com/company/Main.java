package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double t, v, liters;

        Scanner scanner = new Scanner(System.in);

        t = scanner.nextDouble();
        v = scanner.nextDouble();

        liters = (t * v) / 12;

        System.out.printf("%.3f\n", liters);
    }
}
