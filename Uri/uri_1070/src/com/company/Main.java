package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x, counter = 1;

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();

        while(counter <= 6){
            x++;

            if(x % 2 != 0){
                System.out.println(x);
                counter++;
            }
        }
    }
}
