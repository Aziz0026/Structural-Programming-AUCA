package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double s1, s2, s3;

        System.out.print("Enter edges of triangle: ");
        s1 = sc.nextDouble();
        s2 = sc.nextDouble();
        s3 = sc.nextDouble();

        if(s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1){
            System.out.println("The perimeter is " + (s1 + s2 + s3));
        }else{
            System.out.println("The input is invalid.");
        }
    }
}
