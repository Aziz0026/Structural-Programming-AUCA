package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int index;

        Scanner sc = new Scanner(System.in);
        index = sc.nextInt() - 1;

        String[] months = {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        };

        System.out.println(months[index]);

    }
}
