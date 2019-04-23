package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double r, volume, pi = 3.14159 ;

        Scanner scanner = new Scanner(System.in);

        r = scanner.nextDouble();

        volume = (4 / 3.0) * pi * Math.pow(r, 3.0);

        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
