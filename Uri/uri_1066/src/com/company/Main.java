package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x, evenNumbers = 0, oddNumbers = 0, positiveNumbers = 0, negativeNumbers = 0, counter = 1;

        Scanner sc = new Scanner(System.in);

        while(counter <= 5){
            counter++;

            x = sc.nextInt();

            if (x % 2 == 0) {
                evenNumbers += 1;
            }

            if (x % 2 != 0) {
                oddNumbers += 1;
            }

            if (x > 0) {
                positiveNumbers += 1;
            }

            if (x < 0) {
                negativeNumbers += 1;
            }
        }


        System.out.print(evenNumbers+" valor(es) par(es)\n");
        System.out.print(oddNumbers+" valor(es) impar(es)\n");
        System.out.print(positiveNumbers+" valor(es) positivo(s)\n");
        System.out.print(negativeNumbers+" valor(es) negativo(s)\n");
    }
}
