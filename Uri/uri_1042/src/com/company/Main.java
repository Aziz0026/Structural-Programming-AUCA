package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, c;

        //initializing new array for numbers
        ArrayList<Integer> intArray = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        //adding integers to list array
        intArray.add(a);
        intArray.add(b);
        intArray.add(c);

        //sorting numbers in ascending order
        Collections.sort(intArray);

        print(intArray.get(0), intArray.get(1), intArray.get(2));

        //sorting numbers in descending order
        intArray.sort(Collections.reverseOrder());

        System.out.print("\n");
        print(a, b, c);
    }

    private static void print(int a, int b, int c){
        System.out.printf(
                        "%d\n" +
                        "%d\n" +
                        "%d\n",
                            a,
                            b,
                            c
        );
    }
}
