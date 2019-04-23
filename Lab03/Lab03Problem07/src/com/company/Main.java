package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        String today, future;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        a = sc.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        b = sc.nextInt();

        today =  day(a);

        c = (a + b) % 7;

        future =  day(c);

        System.out.println("Today is " + today + " and the future day is " + future);
    }

    private static String day(int number) {
        switch (number) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 0:
                return "Sunday";
            default:
                System.out.println("Invalid number. Please enter number between [0..6].");
                break;
        }
        return null;
    }
}
