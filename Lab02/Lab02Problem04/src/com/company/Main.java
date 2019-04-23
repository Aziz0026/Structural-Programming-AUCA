package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double INCHE = 2.54;

        Scanner sc = new Scanner(System.in);

        System.out.print("Length in inches? ");
        double inches = sc.nextDouble();

        double cm = inches * INCHE;

        System.out.printf("%.2f in. = %.2f cm.", inches, cm);
    }
}
