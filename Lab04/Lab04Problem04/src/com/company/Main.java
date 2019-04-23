package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x;

        Scanner sc = new Scanner(System.in);

        System.out.print("Complexity level? ");
        x = sc.nextInt();

        switch (x){
            case 4:
            case 5:
                System.out.println("You are a pro gamer.");
                break;
            case 2:
            case 3:
                System.out.println("You are an experienced gamer.");
                break;
            case 0:
                System.out.println("Total newbie.");
                break;
            case 1:
                System.out.println("You are a beginner.");
                break;
            default:
                System.out.println("Invalid level.");
        }
    }
}
