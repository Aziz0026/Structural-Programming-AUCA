package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float a;

        Scanner sc = new Scanner(System.in);

        a = sc.nextFloat();

        if(a >= 0 && a <= 25.0000){
            System.out.print("Intervalo [0,25]\n");
        }else if(a >= 25.00001 && a <= 50.0000000){
            System.out.print("Intervalo (25,50]\n");
        }else if(a >= 50.00001 && a <= 75.0000000){
            System.out.print("Intervalo (50,75]\n");
        }else if (a >= 75.0001 &&  a<= 100.0000000){
            System.out.print("Intervalo (75,100]\n");
        }else{
            System.out.print("Fora de intervalo\n");
        }
    }
}
