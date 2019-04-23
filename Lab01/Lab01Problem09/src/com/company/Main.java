package com.company;

public class Main {

    public static void main(String[] args) {
        double firstResult, secondResult;

        firstResult = (4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));
        secondResult = (4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13)));

        //first solution
        System.out.println("               1     1     1     1    1 ");
        System.out.printf("Pi = 4 x (1 - --- + --- - --- + --- - ---) = %.1f\n", firstResult);
        System.out.println("               3     5     7     9    11\n");

        //second solution
        System.out.println("               1     1     1     1     1     1");
        System.out.printf("Pi = 4 x (1 - --- + --- - --- + --- - --- + ---) = %.1f\n", secondResult);
        System.out.println("               3     5     7     9     11    13");
    }
}
