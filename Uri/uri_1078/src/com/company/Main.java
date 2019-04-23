package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x, counter = 1;

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();

        while(counter <= 10){
            if(1 < x && x < 1000){
                System.out.printf("%d x %d = %d\n", counter, x, (counter * x));
                counter++;
            }

        }
    }
}
