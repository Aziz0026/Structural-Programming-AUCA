package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        double discriminant = b * b - (4 * a * c);

        double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
        double r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);

        if (discriminant > 0){
            System.out.println("The roots are " + r1 + " and " + r2 + ".\n");
        }else if(discriminant == 0){
            System.out.println("The root is " + r1 + ".\n");
        }else{
            System.out.println("The equation has no real roots.\n");
        }
    }
}
