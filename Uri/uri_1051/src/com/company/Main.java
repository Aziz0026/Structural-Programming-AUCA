package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float salary, result;

        Scanner sc = new Scanner(System.in);

        salary = sc.nextFloat();

        if(salary <= 2000){
            System.out.println("Isento");
        }else{
            if(salary <= 3000){
                result = ((salary - 2000) * 8) / 100;
            }else if(salary <= 4500){
                result = ((((salary - 2000) - ((salary - 2000) - 1000)) * 8) / 100) + (((salary - 2000) - 1000) * 18) / 100;
            }else{
                double first = salary - 2000;
                double second = first - 1000;
                double third = second - 1500;

                first -= second;
                second -= third;

                result = (float) (((first * 8) / 100) + ((second * 18) / 100) + ((third * 28) / 100));
            }
            System.out.printf("R$ %.2f\n", result);
        }
    }
}