package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> lotteryNumbers = new ArrayList<>();
        ArrayList<Integer> userNumbers = new ArrayList<>();

        int user, lottery = (int) (Math.random() * 1000);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your lottery pick (three-digit): ");
        user = sc.nextInt();

        userNumbers.add(user / 100);
        userNumbers.add((user % 100) / 10);
        userNumbers.add(user % 10);

        lotteryNumbers.add(lottery / 100);
        lotteryNumbers.add((lottery % 100) / 10);
        lotteryNumbers.add(lottery % 10);

        lotteryNumbers.removeAll(userNumbers);

        if (user == lottery) {
            System.out.println("Exact match, you won $10,000.");
        } else if (lotteryNumbers.size() == 0) {
            System.out.println("Three matched numbers, you won $3,000.");
        } else if (lotteryNumbers.size() == 1) {
            System.out.println("Two matched numbers, you won $5,000.");
        } else if (lotteryNumbers.size() == 2) {
            System.out.println("One matched number, you won $1,000.");
        } else if (lotteryNumbers.size() == 3) {
            System.out.println("Sorry, there is no matched numbers.");
        }
    }

}
