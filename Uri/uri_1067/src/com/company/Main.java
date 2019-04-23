package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x, counter = 1;

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();

        while(counter <= x){
            if((counter % 2) > 0){
                System.out.println(counter);
            }
            counter++;
        }
    }
}
