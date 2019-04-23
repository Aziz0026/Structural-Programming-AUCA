package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double salary, sales, total;
        String name;

        Scanner scanner = new Scanner(System.in);

        name = scanner.nextLine();
        salary = scanner.nextDouble();
        sales = scanner.nextDouble();

        total = salary + sales * 0.15;

        System.out.printf("TOTAL = R$ %.2f\n", total);
    }
}
