package com.company;

import java.util.Hashtable;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String a, b, c;

        //First part
        Hashtable<String, Hashtable> first = new Hashtable<>();

        //Second part
        Hashtable<String, Hashtable> second1 = new Hashtable<>();
        Hashtable<String, Hashtable> second2 = new Hashtable<>();

        //Third part
        Hashtable<String, String> third1 = new Hashtable<>();
        Hashtable<String, String> third2 = new Hashtable<>();
        Hashtable<String, String> third3 = new Hashtable<>();
        Hashtable<String, String> third4 = new Hashtable<>();

        //first chain values
        first.put("vertebrado", second1);
        first.put("invertebrado", second2);

        //second chain values
        second1.put("ave", third1);
        second1.put("mamifero", third2);
        second2.put("inseto", third3);
        second2.put("anelideo", third4);

        //third chain value
        third1.put("carnivoro", "aguia");
        third1.put("onivoro", "pomba");

        third2.put("onivoro", "homem");
        third2.put("herbivoro", "vaca");

        third3.put("hematofago", "pulga");
        third3.put("herbivoro", "lagarta");

        third4.put("hematofago", "sanguessuga");
        third4.put("onivoro", "minhoca");

        Scanner sc = new Scanner(System.in);

        a = sc.nextLine();
        b = sc.nextLine();
        c = sc.nextLine();

       Hashtable one =  first.get(a);
       Hashtable two = (Hashtable) one.get(b);
       String three = (String) two.get(c);

       System.out.println(three);
    }
}
