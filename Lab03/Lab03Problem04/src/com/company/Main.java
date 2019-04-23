package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x;

        Scanner sc = new Scanner(System.in);

        System.out.print("Year? ");
        x = sc.nextInt();

        if((x % 400 == 0) || ((x % 4 == 0) && (x % 100 != 0))){
            System.out.println("This is a leap year.");
        }else{
            System.out.println("This is not a leap year.");
        }
    }
}
