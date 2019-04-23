package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int year, month = 0, days = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Year? ");
        year = sc.nextInt();

        for(boolean i = true; i;){
            System.out.print("Month? ");
            month = sc.nextInt();

            if(month > 12 || month < 1){
                underline();
                System.out.println("Please enter number from [1..12]");
                underline();
            }else{
                i = false;
            }
        }

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                days = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)) ? 29 : 28;
                break;
                default:
                    System.out.println("Invalid number of month.");
                    break;
        }

        System.out.println("Number of days: " + days);
    }

    private static void underline(){
        System.out.println("-------------------------------");
    }
}
