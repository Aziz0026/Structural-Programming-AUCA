package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float a, b, c, d, e, media, recaverage;

        Scanner sc = new Scanner(System.in);

        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        d = sc.nextFloat();

        media = ((a * 2) + (b * 3) + (c * 4) + d) / 10;

        System.out.printf("Media: %.1f\n", media);

        if(media >=  7.0){
            System.out.println("Aluno aprovado.");
        } else if(media >= 5 && media <= 6.9){

            e = sc.nextFloat();
            recaverage = (e + media) / 2;

            System.out.println("Aluno em exame.");
            System.out.printf("Nota do exame: %.1f\n" , e);

            if(recaverage >= 5.0){
                System.out.println("Aluno aprovado.");
            }else if(recaverage <= 4.9){
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f\n", recaverage);
        } else if (media < 5.0){
            System.out.println("Aluno reprovado.");
        }
    }
}
