package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number, workingHours;
        float hourMoney, salary;

        Scanner scanner = new Scanner(System.in);

        number = scanner.nextInt();
        workingHours = scanner.nextInt();
        hourMoney = scanner.nextFloat();

        salary = workingHours * hourMoney;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n", salary);
    }
}
