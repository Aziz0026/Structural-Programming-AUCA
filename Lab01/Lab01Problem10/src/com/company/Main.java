package com.company;

public class Main {

    public static void main(String[] args) {
        int YEAR = 365;
        int BIRTH = 7, DEATH = 13, IMMIGRANT = 45;

        int currentPopulation = 312032486;

        int birthPerYear = (((60 * 60 * 24 * YEAR) / BIRTH));
        int deathPerYear = (((60 * 60 * 24 * YEAR) / DEATH));
        int immigrantPerYear = (((60 * 60 * 24 * YEAR) / IMMIGRANT));
        int populationPerYear = (birthPerYear + immigrantPerYear - deathPerYear);

        System.out.printf("\nCurrent year population = %d\n", currentPopulation);
        System.out.printf("Next year's population = %d\n", (currentPopulation + populationPerYear));
        System.out.printf("Next 2 year's population = %d\n", (currentPopulation + (populationPerYear * 2)));
        System.out.printf("Next 3 year's population = %d\n", + (currentPopulation + (populationPerYear * 3)));
        System.out.printf("Next 4 year's population = %d\n", (currentPopulation + (populationPerYear * 4)));
        System.out.printf("Next 5 year's population = %d\n", (currentPopulation + (populationPerYear * 5)));
    }
}
