package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float x, y;

        Scanner sc = new Scanner(System.in);

        x = sc.nextFloat();
        y = sc.nextFloat();

        if(y == 0 && x == 0){
            System.out.print("Origem\n");
        }else if(x == 0){
            System.out.print("Eixo Y\n");
        }else if(y == 0){
            System.out.print("Eixo X\n");
        }else if(x < 0 && y > 0){
            System.out.print("Q2\n");
        }else if(x > 0 && y > 0){
            System.out.print("Q1\n");
        }else if(x > 0 && y < 0){
            System.out.print("Q4\n");
        }else{
            System.out.print("Q3\n");
        }
    }
}
