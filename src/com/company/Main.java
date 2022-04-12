package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    static ArrayList<Examen> examens = new ArrayList<>();

    static void examenLijst() {
        for (int i = 0; i < examens.size(); i++) {
            System.out.println(i + 1 + ". " + examens.get(i).getExamen());
        }
    }

    public static void main(String[] args) {

        Examen rekenen = new Examen("Rekenen");
        Examen wiskunde = new Examen("Wiskunde");
        Examen programming = new Examen("Programming");
        examens.add(rekenen);
        examens.add(wiskunde);
        examens.add(programming);
        Student student = new Student();
        Examen examen = new Examen();
        Cijfer cijfer = new Cijfer();
        Vraag vraag = new Vraag();
        Menu menu = new Menu();
        menu.addMenu();
        vraag.addRekenExamenVragen();
        vraag.addWiskundeExamenVragen();
        vraag.addProgrammingExamenVragen();
        //ExamenLijst.addExamenLijst();
        boolean nogEenKeer = true;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("[Controle paneel]");
                menu.printMenu();
                System.out.println("Voer een commandnummer in");
                int commandnummer = scanner.nextInt();
                if (commandnummer == 1) {
                    System.out.println("Studentenlijst");
                    student.studentenLijst();
                } else if (commandnummer == 2) {
                    System.out.println("Examenlijst");
                    examenLijst();
                    System.out.println("________________");
                } else if (commandnummer == 3) {
                    System.out.println("Student inschrijven");
                    student.studentInschrijven();
                    System.out.println("________________");
                } else if (commandnummer == 4) {
                    System.out.println("Student verwijderen");
                    student.studentVerwijderen();
                    System.out.println("________________");
                } else if (commandnummer == 5) {
                    System.out.println("Log in voordat je een examen kan afnemen");
                    examen.runExamen(examen);
                    System.out.println("________________");
                } else if (commandnummer == 6) {
                    System.out.println("Welke student wil je opzoeken?");
                    cijfer.cijfersResultaat();
                    System.out.println("________________");
                } else if (commandnummer == 7) {
                    System.out.println("Welke student heeft de meeste examens gehaald?");
                    cijfer.printCijfers();
                    System.out.println("________________");
                } else if (commandnummer == 8) {
                    System.out.println("Het systeem wordt afgesloten");
                    nogEenKeer = false;
                } else {
                    System.out.println("Command ongeldig");
                    System.out.println("________________");
                }
            } catch (InputMismatchException E) {
                System.out.println("Command ongeldig");
                System.out.println("________________");
            }
        } while (nogEenKeer);
    }
}












