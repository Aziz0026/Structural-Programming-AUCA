package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a, b, c;

        ArrayList<Double> array = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        array.add(a);
        array.add(b);
        array.add(c);

        array.sort(Collections.reverseOrder());

        a = array.get(0);
        b = array.get(1);
        c = array.get(2);

        if(a >= b + c){
            System.out.println("NAO FORMA TRIANGULO");
        }else if(Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2))){
            System.out.println("TRIANGULO RETANGULO");
        }else if(Math.pow(a, 2) > (Math.pow(b, 2) + Math.pow(c, 2))){
            System.out.println("TRIANGULO OBTUSANGULO");
        }else if(Math.pow(a, 2) < (Math.pow(b, 2) + Math.pow(c, 2))){
            System.out.println("TRIANGULO ACUTANGULO");
        }

        if(a == b && b == c){
            System.out.println("TRIANGULO EQUILATERO");
        }

        if((c == a && c != b) || (a == b && a != c) || (b == c && b != a)){
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
