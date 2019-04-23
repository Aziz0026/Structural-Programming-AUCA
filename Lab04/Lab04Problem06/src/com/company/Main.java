package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x, y;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a pint with two coordinates: ");
        x = sc.nextDouble();
        y = sc.nextDouble();

        double xDistance = Math.pow(x * x, 0.5D);
        double yDistance = Math.pow(y * y, 0.5D);

        if ((yDistance <= 2.5) && (xDistance <= 5.0)) {
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle.");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is not in the rectangle.");
        }
    }
}
