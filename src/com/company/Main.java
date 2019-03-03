package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello");
        Person oleg = new Person(true, "Oleg");
        Person july = new Person(false, "July");
        Person igor = new Person(true, "Igor");
        Person kate = new Person(false, "Kate");
        System.out.println(oleg.marry(july));
        System.out.println(oleg.marry(igor));
        System.out.println(oleg.marry(kate));
        System.out.println(oleg.GetSpouseName());
        System.out.println(kate.GetSpouseName());
        System.out.println(july.GetSpouseName());


    }
}
