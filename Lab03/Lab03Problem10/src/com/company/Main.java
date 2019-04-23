package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double x, y, d;
        String s = " ";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        x = sc.nextDouble();
        y = sc.nextDouble();

        d  = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        if(d >= 10){
            s = " not ";
        }

        System.out.println("Point " + x + ", " + y + " is" + s + "in the circle.");
    }
}
