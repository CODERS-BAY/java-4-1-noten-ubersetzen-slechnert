package com.coders.bay;

import java.util.Scanner;

public class Notenuebersetzen {
    public static void main(String[] args) {
        int note;

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte Note eingeben");
        note = sc.nextInt();

        switch (note) {
            case 1:
                System.out.println("Sehr gut");
                break;
            case 2:
                System.out.println("Gut");
                break;
            case 3:
                System.out.println("efriedigend");
                break;
            case 4:
                System.out.println("Genügend");
                break;
            case 5:
                System.out.println("Nicht genügend");
                break;
            default:
                System.out.println("Das ist keine Note!");
        }
    }
}
