package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double cel, far;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        cel = sc.nextDouble();

        far = (cel * 9 / 5) + 32;

        System.out.printf("%.0f Celsius is %.1f Fahrenheit\n", cel, far);
    }
}
