package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, qty;
        double total;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        qty = sc.nextInt();

        if (a == 1) {
            total = 4.00 * qty;
        } else if (a == 2) {
            total = 4.50 * qty;
        } else if (a == 3) {
            total = 5.00 * qty;
        } else if (a == 4) {
            total = 2.00 * qty;
        } else {
            total = 1.50 * qty;
        }

        System.out.printf("Total: R$ %.2f\n", total);
    }
}
