package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a, b, c, x1, x2, discriminant;

        Scanner sc = new Scanner(System.in);

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();


        if((a == 0) || (((b * b) -(4 * a * c)) < 0)){
            System.out.print("Impossivel calcular\n");
        }else{
            discriminant = (b * b) - 4 * a *c;

            x1 = ((-b + Math.sqrt(discriminant)) / (2 * a));
            x2 = ((-b - Math.sqrt(discriminant)) / (2 * a));

            System.out.printf("R1 = %.5f\n", x1);
            System.out.printf("R2 = %.5f\n", x2);
        }

    }
}
