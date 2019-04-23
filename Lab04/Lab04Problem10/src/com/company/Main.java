package com.company;

public class Main {

    public static void main(String[] args) {
        int card = (int) (Math.random() * 52);
        int suit = (int) (Math.random() * 4);
        int rank = card / 4;

        String strSuit = "", strRank;

        switch (rank){
            case 0:
                strRank = "Ace";
                break;
            case 10:
                strRank = "Jack";
                break;
            case 11:
                strRank = "Queen";
                break;
            case 12:
                strRank = "King";
                break;
                default:
                    strRank = "" + (rank + 1);
                    break;
        }

        /*

        switch (suit){
            case 0:
                strSuit = "Spades";
                break;
            case 1:
                strSuit = "Hearts";
                break;
            case 2:
                strSuit = "Diamonds";
                break;
            case 3:
                strSuit = "Clubs";
                break;
                default:
                    System.out.println("Something went wrong.");
                    System.exit(-1);
        }

        */

        //TODO
        //Another simple trick

        switch (suit){
            case 0:
                strSuit = "\u2660";
                break;
            case 1:
                strSuit = "\u2764";
                break;
            case 2:
                strSuit = "\u2666";
                break;
            case 3:
                strSuit = "\u2663";
                break;
            default:
                System.out.println("Something went wrong.");
                System.exit(-1);
        }

        System.out.println("The card you picked is " + strRank + " of " + strSuit + ".");
    }
}
