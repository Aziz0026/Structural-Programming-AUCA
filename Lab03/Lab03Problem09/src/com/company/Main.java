package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int computer, user;

        computer = (int) (Math.random() * 3);

        Scanner sc = new Scanner(System.in);

        System.out.print("scissors (0), rock (1), paper (2): ");
        user = sc.nextInt();


        if (user == computer) {
            System.out.println("It is a tie.");
        } else {
            switch (user) {
                case 0:
                    if (computer == 2)
                        output("scissors", "paper", true);
                    else
                        output("scissors", "rock", false);
                    break;
                case 1:
                    if (computer == 0)
                        output("rock", "scissors", true);
                    else
                        output("rock", "paper", false);
                    break;
                case 2:
                    if (computer == 1)
                        output("paper", "rock", true);
                    else
                        output("paper", "scissors", false);
                    break;
                    default:
                        System.out.println("Something went wrong!");
            }
        }
    }

    private static void output(String user, String computer, Boolean result){
        String winner;

        if(result){
            winner = "You won.";
        }else{
            winner = "Computer won.";
        }

        System.out.println("The computer is " + computer + ". You are " + user + ". " + winner);
    }
}
