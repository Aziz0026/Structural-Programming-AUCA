package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a > b){
            if(b > c){
                System.out.println(c + " " + b + " " + a);
            }else{
                System.out.println(b + " " + c + " " + a);
            }
        }else{
            if(a > c){
                System.out.println(c + " " + a + " " + b);
            }else{
                System.out.println(a + " " + c + " " + b);
            }
        }
    }
}
