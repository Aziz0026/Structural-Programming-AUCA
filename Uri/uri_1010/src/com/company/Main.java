package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int code, qty;  // code of the product, quantity of product

        double price, totalPrice; //price of the one product, total price of all products

        Scanner scanner = new Scanner(System.in);

        code = scanner.nextInt();

        qty = scanner.nextInt();
        price = scanner.nextDouble();
        totalPrice = qty * price;

        code = scanner.nextInt();

        qty = scanner.nextInt();
        price = scanner.nextDouble();

        totalPrice += qty * price;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalPrice);
    }
}
