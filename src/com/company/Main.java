package com.company;

public class Main {

    public static void main(String[] args) {
        double myDouble = 20;
        System.out.println(myDouble);
        double mySecondDouble = 80;
        System.out.println(mySecondDouble);
        double third = (myDouble + mySecondDouble) * 100;
        System.out.println(third);
        double forth = third % 40;
        System.out.println(forth);
        boolean fifth = forth == 0;
        System.out.println(fifth);
        if (!fifth) System.out.println("got some value");
    }
}
