package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, prod;

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();

        prod = a * b;

        System.out.println("PROD = " + prod);
    }
}
