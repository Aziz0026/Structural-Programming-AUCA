package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, amount, total = 0;
        int
                c_total = 0,
                r_total = 0,
                s_total = 0;

        float
                cPercent = 0,
                rPercent = 0,
                sPercent = 0;

        String animalChar;
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            amount = sc.nextInt();
            animalChar = sc.next();
            total += amount;

            switch (animalChar) {
                case "C":
                    c_total += amount;
                    break;
                case "R":
                    r_total += amount;
                    break;
                case "S":
                    s_total += amount;
                    break;
                    default:
                        System.err.println("Something went wrong!");
            }

            cPercent = (float) ((c_total * 100.00) / total);
            rPercent = (float) ((r_total * 100.00) / total);
            sPercent = (float) ((s_total * 100.00) / total);

        }

        System.out.print("Total: " + total + " cobaias\n");
        System.out.print("Total de coelhos: " + c_total + "\n");
        System.out.print("Total de ratos: " + r_total + "\n");
        System.out.print("Total de sapos: " + s_total + "\n");

        System.out.printf("Percentual de coelhos: %.2f", cPercent);
        System.out.print(" %\n");
        System.out.printf("Percentual de ratos: %.2f", rPercent);
        System.out.print(" %\n");
        System.out.printf("Percentual de sapos: %.2f", sPercent);
        System.out.print(" %\n");
    }
}
