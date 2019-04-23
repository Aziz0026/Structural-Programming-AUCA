package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float x;
        int positiveNumbers = 0, counter = 1;

        Scanner sc = new Scanner(System.in);

        while (counter <= 6) {
            x = sc.nextFloat();
            if (x > 0) {
                positiveNumbers += 1;
            }
            counter++;
        }

        System.out.print(positiveNumbers + " valores positivos\n");
    }
}
