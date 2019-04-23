package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1st int? ");
        double first = scanner.nextDouble();
        System.out.print("2st int? ");
        double second = scanner.nextDouble();
        double addition = first + second;
        printResult(first, second, "+", addition);
        double subtraction = first - second;
        printResult(first, second, "-", subtraction);
        double multiplication = first * second;
        printResult(first, second, "*", multiplication);
        double division = first / second;
        printResult(first, second, "/", division);
        double reminder = first % second;
        printResult(first, second, "%", reminder);
    }

    private static void printResult(double firstNumber, double secondNumber, String operationSign, double result) {
        String formattedString = String.format("%.1f %s %.1f = %f", firstNumber, operationSign, secondNumber, result);
        System.out.println(formattedString);
    }
}