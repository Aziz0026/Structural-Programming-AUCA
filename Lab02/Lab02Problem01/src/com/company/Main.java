package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b;

        Scanner sc = new Scanner(System.in);

        System.out.print("1st value? ");
        a = sc.nextInt();
        System.out.print("2nd value? ");
        b = sc.nextInt();

        System.out.printf("Before swapping: a = %d;  b = %d;%n", a, b);

        /*
            int temp = a;
            a = b;
            b += a;
        */

        a = a + b;
        b = a - b;
        a = a - b;


        System.out.printf("After swapping: a = %d;  b = %d;%n", a, b);
    }
}
