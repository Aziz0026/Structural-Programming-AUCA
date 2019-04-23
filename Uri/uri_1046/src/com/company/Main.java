package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int strtTm, endTm, durationTm;

        Scanner sc = new Scanner(System.in);
        strtTm = sc.nextInt();
        endTm = sc.nextInt();

        durationTm = endTm - strtTm;

        if (durationTm < 0)
        {
            durationTm = 24 + (endTm - strtTm);
        }

        if (strtTm == endTm)
        {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }

        else System.out.printf("O JOGO DUROU %d HORA(S)\n", durationTm);
    }
}
