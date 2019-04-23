package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int minutes, years, days;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of minutes: ");
        minutes = sc.nextInt();

        years = (int) (minutes / 60 / 24 / 365);
        days = (int) (minutes / 60 / 24 % 365);

        System.out.printf("%d minutes is approximately %d years and %d days\n", minutes, years, days);
    }
}
