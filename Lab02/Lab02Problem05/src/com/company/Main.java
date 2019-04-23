package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Temperature in degrees Fahrenheit?");
        double degreesFahrenheit =  scanner.nextDouble();

        double degreesCelsius = 5.0 / 9.0 * (degreesFahrenheit - 32);

        System.out.printf("The temperature in degrees Celsius is %.2f%n", degreesCelsius);
    }
}
