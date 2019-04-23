package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int
                d,
                y,
                temp,
                months,
                days;

        Scanner sc = new Scanner(System.in);

        d =  sc.nextInt();

        y = d / 365;

        temp  = d - (y * 365);
        months = temp / 30;

        days  = temp % 30;

        System.out.printf(
                "%d ano(s)\n" +
                "%d mes(es)\n" +
                "%d dia(s)\n",
                y,
                months,
                days
        );
    }
}
