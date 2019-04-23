package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double radius, area;

        Scanner scanner = new Scanner(System.in);
        radius = scanner.nextDouble();

        area = 3.14159 * radius * radius;

        System.out.printf("A=%.4f\n", area);
    }
}
