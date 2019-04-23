package com.company;

import java.util.Hashtable;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int key;

        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(61, "Brasilia");
        table.put(71,"Salvador");
        table.put(11, "Sao Paulo");
        table.put(21, "Rio de Janeiro");
        table.put(32, "Juiz de Fora");
        table.put(19, "Campinas");
        table.put(27, "Vitoria");
        table.put(31, "Belo Horizonte");

        Scanner sc = new Scanner(System.in);

        key = sc.nextInt();

        System.out.println(table.getOrDefault(key, "DDD nao cadastrado"));
    }
}
