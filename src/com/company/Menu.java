package com.company;

import java.util.ArrayList;

class Menu extends Main {
    protected static ArrayList<String> Menu = new ArrayList<>();
    public Menu() {
    }

    public static void addMenu() {
        Menu.add("Lijst met studenten");
        Menu.add("Lijst met examens");
        Menu.add("Nieuwe student inschrijven");
        Menu.add("Student verwijderen");
        Menu.add("Examen afnemen");
        Menu.add("Examenresultaten van alle studenten");
        Menu.add("Welke student heeft de meeste examens gehaald?");
        Menu.add("Exit");
    }
    public static void printMenu(){
        for (int i = 0; i < Menu.size(); i++) {
            System.out.println(i + 1 + ". " + Menu.get(i));
        }
    }
}