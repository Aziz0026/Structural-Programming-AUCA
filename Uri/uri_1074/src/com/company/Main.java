package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number, x, counter = 1;

        Scanner sc = new Scanner(System.in);

        number = sc.nextInt();

        while (counter <= number){
            x = sc.nextInt();

            if (x == 0) {
                System.out.println("NULL");
            } else if (x % 2 == 0) {
                if (x > 0) {
                    System.out.println("EVEN POSITIVE");
                } else {
                    System.out.println("EVEN NEGATIVE");
                }
            } else {
                if (x > 0) {
                    System.out.println("ODD POSITIVE");
                } else {
                    System.out.println("ODD NEGATIVE");
                }
            }
            counter++;
        }
    }
}