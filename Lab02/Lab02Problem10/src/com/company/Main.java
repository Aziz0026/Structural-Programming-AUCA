package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        int YEAR = 365;
        int BIRTH = 7, DEATH = 13, IMMIGRANT = 45;

        int currentPopulation = 312032486;

        int birthPerYear = (((60 * 60 * 24 * YEAR) / BIRTH));
        int deathPerYear = (((60 * 60 * 24 * YEAR) / DEATH));
        int immigrantPerYear = (((60 * 60 * 24 * YEAR) / IMMIGRANT));
        int populationPerYear = (birthPerYear + immigrantPerYear - deathPerYear);

        System.out.print("Enter the number of years: ");
        x = sc.nextInt();

        System.out.printf("Next %d year's population = %d\n", x, currentPopulation + (populationPerYear * x));

    }
}
