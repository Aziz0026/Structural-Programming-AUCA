package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x;

        Scanner sc = new Scanner(System.in);

        System.out.print("Month? ");
        x = sc.nextInt();

        /*
            if (x >= 1 && x <= 12) {
                if (x >= 3 && x <= 5) {
                    System.out.println("Spring");
                } else if (x > 5 && x <= 8) {
                    System.out.println("Summer");
                } else if (x > 8 && x <= 11) {
                    System.out.println("Autumn");
                } else {
                    System.out.println("Winter");
                }
            } else {
                System.out.println("Number should be from [1..12].");
                System.exit(-1);
            }
        */

        //Same task made with switch

        switch (x) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Number should be from [1..12].");
                System.exit(-1);
                break;
        }
    }
}

