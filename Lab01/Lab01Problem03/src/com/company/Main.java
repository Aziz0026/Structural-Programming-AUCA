package com.company;

import java.util.Scanner; //code that connects library

public class Main {
    public static void main(String[] args) {
        String name; //declaration

        System.out.print("What is your name? ");
        Scanner scanner  = new Scanner(System.in);
        name  = scanner.nextLine(); //initialization
        System.out.println("Hello, " + name + "!");
    }
}

/*
Data Types
1. How much memory to reserve
2.
 */