package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double salary, newSalary = 0;
        double percent;

        Scanner sc = new Scanner(System.in);

        salary = sc.nextFloat();

        if(salary >= 0 && salary <= 400){
            newSalary = salary * 1.15;
        }else if(salary >= 400.01 && salary <= 800.00){
            newSalary = salary * 1.12;
        }else if(salary >= 800.01 && salary <= 1200.00){
            newSalary = salary * 1.10;
        }else if(salary >= 1200.01 && salary <= 2000.00){
            newSalary = salary * 1.07;
        }else if(salary > 2000){
            newSalary = salary * 1.04;
        }

        percent = (newSalary - salary) / (salary / 100);

        System.out.printf("Novo salario: %.2f\n", newSalary);
        System.out.printf("Reajuste ganho: %.2f\n", newSalary - salary);
        System.out.printf("Em percentual: %.0f %%\n", percent);

    }
}
