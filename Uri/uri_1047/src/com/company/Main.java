package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int     hoursStart,
                hoursEnd,
                minutesStart,
                minutesEnd,
                hoursDuration,
                minutesDuration;

        Scanner sc = new Scanner(System.in);

        hoursStart = sc.nextInt();
        minutesStart = sc.nextInt();
        hoursEnd = sc.nextInt();
        minutesEnd = sc.nextInt();

        hoursDuration = hoursEnd - hoursStart;

        if (hoursDuration < 0) {
            hoursDuration = 24 + (hoursEnd - hoursStart);
        }

        minutesDuration = minutesEnd - minutesStart;

        if (minutesDuration < 0) {
            minutesDuration = 60 + (minutesEnd - minutesStart);
            hoursDuration--;
        }

        if (hoursStart == hoursEnd && minutesStart == minutesEnd) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        } else{
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", hoursDuration, minutesDuration);
        }
    }
}
