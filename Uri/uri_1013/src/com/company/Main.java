package com.company;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {
        int a, b, c, result;

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        result = greatest(greatest(a, b), c);

        System.out.printf("%d eh o maior\n", result);
    }

    private static int greatest(int a, int b){
        return (a + b + abs(a - b)) / 2;
    }
}