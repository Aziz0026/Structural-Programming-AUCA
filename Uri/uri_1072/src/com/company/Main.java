package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x, counter = 1, number;
        int start = 10, end = 20, in = 0, out = 0;

        Scanner sc = new Scanner(System.in);

        number = sc.nextInt();

        while(counter <= number){
            x = sc.nextInt();

            if(x >= start && x <= end){
                in++;
            }else{
                out++;
            }
            counter++;
        }

        System.out.printf("%d in\n%d out\n", in, out);
    }
}
