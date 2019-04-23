package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t; //given seconds

        t = sc.nextInt();

        int hours =  t / 3600;

        int temp = t - (hours * 3600);
        int minutes = temp / 60;

        int seconds = t % 60 ;

        System.out.printf("%d:%d:%d\n", hours, minutes, seconds);
    }
}
