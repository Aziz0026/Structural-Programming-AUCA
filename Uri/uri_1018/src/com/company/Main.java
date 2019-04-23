package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int bill, reminder;
        String template = "%d nota(s) de R$ %s\n";

        Scanner scanner = new Scanner(System.in);
        bill = scanner.nextInt();

        System.out.println(bill);
        System.out.printf(template, bill/100, "100,00");
        reminder = bill % 100;

        System.out.printf(template, reminder/50, "50,00");
        reminder = reminder % 50;

        System.out.printf(template, reminder/20, "20,00");
        reminder = reminder % 20;

        System.out.printf(template, reminder/10, "10,00");
        reminder = reminder % 10;

        System.out.printf(template, reminder/5, "5,00");
        reminder = reminder % 5;

        System.out.printf(template, reminder/2, "2,00");
        reminder = reminder % 2;

        System.out.printf(template, reminder, "1,00");
    }
}