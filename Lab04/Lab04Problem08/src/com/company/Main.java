package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double x;
        double cost = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight of the package: ");
        x = sc.nextDouble();

        if(0 < x && x <= 1){
            cost += 3.5;
        }else if(1 < x && x <= 3){
            cost += 5.5;
        }else if(3 < x && x <= 10){
            cost += 8.5;
        }else if(10 < x && x <= 20){
            cost += 10.5;
        }else if(x > 50){
            System.out.println("The package can not be shipped.");
        }

        if(cost != 0){
            System.out.println("The cost of your shipping is " + cost + ". (in pounds)");
        }

    }
}
