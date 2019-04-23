package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 60, j = 1; i >= 0; i -= 5, j += 3) {
            System.out.printf("I=%d J=%d\n", j, i);
        }
    }
}
