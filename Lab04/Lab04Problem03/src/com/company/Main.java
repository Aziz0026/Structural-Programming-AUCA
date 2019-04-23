package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x;

        Scanner sc = new Scanner(System.in);

        System.out.print("Month? ");
        x = sc.nextInt();

        switch (x){
            case 1:
                System.out.println("winter");
                break;
            case 2:
                System.out.println("winter");
                break;
            case 3 :
                System.out.println("spring");
                break;
            case 4:
                System.out.println("spring");
                break;
            case 5:
                System.out.println("spring");
                break;
            case 6 :
                System.out.println("summer");
                break;
            case 7:
                System.out.println("summer");
                break;
            case 8 :
                System.out.println("summer");
                break;
            case 9:
                System.out.println("autumn");
                break;
            case 10 :
                System.out.println("autumn");
                break;
            case 11 :
                System.out.println("autumn");
                break;
            case 12 :
                System.out.println("winter");
                break;
                default:
                    System.out.println("Invalid month.");
        }
    }
}
