package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int points;

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of points? ");
        points = sc.nextInt();

        if(points <= 40){
            System.out.print(
                    "You failed “Structured Programming”!!!\n" +
                    "You can take it again in the fall semester of 2019.\n"
            );
        }else{
            System.out.print(
                    "You passed “Structured Programming”!!!\n" +
                    "You should take “Object-Oriented Programming” in the next semester.\n"
            );
        }
    }
}
