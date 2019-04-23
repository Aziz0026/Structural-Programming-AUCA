package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float a, b, area;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");
        a = sc.nextFloat();
        b = sc.nextFloat();

        area = (float) (a * a * 3.14);

        System.out.printf("The area is %.4f\n", area);
        System.out.printf("The volume is %.1f\n", area * b);
    }
}
