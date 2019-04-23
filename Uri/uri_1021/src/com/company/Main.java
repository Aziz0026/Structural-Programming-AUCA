package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double bucks;
        int
                note100,
                note50,
                note20,
                note10,
                note5,
                note2;
        int
                moeda1,
                moeda5,
                moeda25,
                moeda10,
                moeda05,
                moeda01;

        double reminder;

        String notes_template = "%d nota(s) de R$ %s\n";
        String moedas_template = "%d moeda(s) de R$ %s\n";

        Scanner sc = new Scanner(System.in);

        bucks = sc.nextFloat();

        note100 = (int) (bucks / 100);
        note50 = (int) (bucks % 100) / 50;
        note20 = (int) (bucks % 100 % 50) / 20;
        note10  = (int) (bucks % 100 % 50 % 20) / 10;
        note5 = (int) (bucks % 100 % 50 % 20 % 10) / 5;
        note2 = (int) (bucks % 100 % 50 % 20 % 10 % 5) / 2;

        moeda1 = (int) ((bucks % 100 % 50 % 20  % 5 % 2) / 1);
        reminder = (((((bucks % 100) % 50) % 20) % 5) % 2);

        moeda5 = (int) ((reminder % 1) / .5);
        moeda25  = (int) (((reminder % 1) % .5) / .25);
        moeda10  = (int) ((((reminder % 1) % .5) % .25) / .1);
        moeda05  = (int) (((((reminder % 1) % .5) % .25) % .1) / .05);
        moeda01  = (int) Math.round((((((reminder % 1) % .5) % .25) % .1) % .05) / 0.01);

        System.out.println("NOTAS:");
        System.out.printf(notes_template, note100, "100.00");
        System.out.printf(notes_template, note50, "50.00");
        System.out.printf(notes_template, note20, "20.00");
        System.out.printf(notes_template, note10, "10.00");
        System.out.printf(notes_template, note5, "5.00");
        System.out.printf(notes_template, note2, "2.00");

        System.out.println("MOEDAS:");
        System.out.printf(moedas_template, moeda1, "1.00");
        System.out.printf(moedas_template, moeda5, "0.50");
        System.out.printf(moedas_template, moeda25, "0.25");
        System.out.printf(moedas_template, moeda10, "0.10");
        System.out.printf(moedas_template, moeda05, "0.05");
        System.out.printf(moedas_template, moeda01, "0.01");
    }
}

