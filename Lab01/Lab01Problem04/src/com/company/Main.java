package com.company;

import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        int first;
        int second;

        Scanner scanner = new Scanner(System.in);

        System.out.print("1st int? ");
        first = scanner.nextInt();
        System.out.print("2st int? ");
        second = scanner.nextInt();

        int addition = first + second;
        printResult(first, second, "+", addition);

        int subtraction = first - second;
        printResult(first, second, "-", subtraction);

        int multiplication = first * second;
        printResult(first, second, "*", multiplication);

        int division =  first / second;
        printResult(first, second, "/", division);

        int reminder = first % second;
        printResult(first, second, "%", reminder);
    }

    private static void printResult(Integer firstNumber, Integer secondNumber, String operationSign, Integer result){
        String formattedString = String.format(
                "%d %s %d = %d",
                firstNumber,
                operationSign,
                secondNumber,
                result);

        System.out.println(formattedString);
    }
}
