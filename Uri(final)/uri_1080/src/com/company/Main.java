package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, highest = 0, position = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {
            x = input.nextInt();

            if (highest < x) {
                highest = x;
                position = i;
            }
        }
        System.out.print(highest + "\n" + position + "\n");
    }
}