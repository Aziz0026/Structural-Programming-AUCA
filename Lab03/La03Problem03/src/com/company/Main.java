package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, c, greatest = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("1st number? ");
        a = sc.nextInt();

        System.out.print("2nd number? ");
        b = sc.nextInt();

        System.out.print("3rd number? ");
        c = sc.nextInt();

        if (a > b && a > c) {
            greatest = a;
        } else if (b > a && b > c) {
            greatest = b;
        } else if (c > a && c > b) {
            greatest = c;
        }

        System.out.println("The value " + greatest + " is the greatest one.");

    }
}
