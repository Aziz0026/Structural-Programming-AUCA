package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Double x;

        Scanner sc = new Scanner(System.in);

        System.out.print("Some real number? ");
        x = sc.nextDouble();

        System.out.println("|" + x + "|" + " = " + Math.abs(x));
    }
}
