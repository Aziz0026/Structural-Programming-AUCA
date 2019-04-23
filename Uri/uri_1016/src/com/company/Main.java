package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int distance;
        double time;

        Scanner scanner = new Scanner(System.in);

        distance = scanner.nextInt();

        time = (distance / ((90 / 60.0) - (60 / 60.0)));

        System.out.printf("%.0f minutos\n", time);
    }
}
