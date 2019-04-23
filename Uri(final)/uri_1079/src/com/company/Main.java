package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        float number1, number2, number3, average;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 0; i < n; i++ ){
            number1 = sc.nextFloat();
            number2 = sc.nextFloat();
            number3 = sc.nextFloat();
            average = (number1 * 2 + number2 * 3 + number3 * 5) / 10;
            System.out.printf("%.1f\n", average);
        }
    }
}
