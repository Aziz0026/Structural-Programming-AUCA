package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x, counter = 1, even = 0;

        Scanner sc = new Scanner(System.in);

        while(counter <= 5){
            x = sc.nextInt();

            if(x % 2 == 0){
                even++;
            }
            counter++;
        }

        System.out.printf("%d valores pares\n", even);
    }
}
