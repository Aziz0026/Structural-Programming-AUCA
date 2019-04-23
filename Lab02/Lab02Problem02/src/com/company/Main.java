package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String template = "%s swapping: a = %d; b = %d";

        Scanner sc = new Scanner(System.in);

        System.out.print("1st value? ");
        int a = sc.nextInt();

        System.out.print("2nd value? ");
        int b = sc.nextInt();

        System.out.printf(template, "Before", a, b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println();
        System.out.printf(template, "Before", a, b);
    }
}
