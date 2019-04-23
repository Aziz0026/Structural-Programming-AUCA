package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        if((b % a) == 0 || (a % b) == 0){
            System.out.print("Sao Multiplos\n");
        }else{
            System.out.print("Nao sao Multiplos\n");
        }
    }
}
