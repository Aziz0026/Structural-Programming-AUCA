package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double x1, y1, x2, y2, distance;

        Scanner scanner = new Scanner(System.in);

        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();

        distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

        System.out.printf("%.4f\n", distance);
    }
}
