package com.company;

public class Main {

    public static void main(String[] args) {
        double x = 0.1;

        int counter = 0;
        while(counter < 10){
            x += 0.1;
            counter++;
        }

        if(x == 1.0){ // if you add "(int) x" they will be equal
            System.out.println("Equal.");
        }else{
            System.out.println("Not equal.");
        }
    }
}
