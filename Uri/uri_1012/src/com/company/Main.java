package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float a, b, c;
        double pi = 3.14159;

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();

        System.out.printf("TRIANGULO: %.3f\n", (a * c) / 2);
        System.out.printf("CIRCULO: %.3f\n", Math.pow(c, 2) * pi);
        System.out.printf("TRAPEZIO: %.3f\n", ((a + b) / 2) * c);
        System.out.printf("QUADRADO: %.3f\n", b * b);
        System.out.printf("RETANGULO: %.3f\n", a * b);
    }
}
