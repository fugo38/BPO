package com.company;

import java.util.ArrayList;
import java.util.Collections;
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

        Examen rekenen = new Examen("Rekenen", getRekenExamenVragen());
        Examen wiskunde = new Examen("Wiskunde", getRekenExamenVragen());
        Examen programming = new Examen("Programming", getRekenExamenVragen());
        examens.add(rekenen);
        examens.add(wiskunde);
        examens.add(programming);
        Student student = new Student();
        Cijfer cijfer = new Cijfer();
        Vraag vraag = new Vraag();
        Menu menu = new Menu();
        menu.addMenu();
        //ExamenLijst.addExamenLijst();
        boolean nogEenKeer = true;

        //uitprinten van het menu, de gebruiker kan een nummer invoeren, en aan de hand van het ingevoerde getal roep je een specifieke functie aan
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
                    runExamen();
                    System.out.println("________________");
                } else if (commandnummer == 6) {
                    System.out.println("Welke student wil je opzoeken?");
                    cijfer.cijfersResultaat();
                    System.out.println("________________");
                } else if (commandnummer == 7) {
                    System.out.println("Welke student heeft de meeste examens gehaald?");
                    Student.getMeesteExamens();
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

    //met deze methode kan een gebruiker kiezen tussen examens die de gebruiker wilt maken, en word de gekoze examen gestart
    static void runExamen() {
        Scanner scanner = new Scanner(System.in);
        boolean unknown = true;
        Examen examen;
        System.out.println("Wat is uw naam?");
        String inlogNaam = scanner.nextLine();
        System.out.println("Wat is uw studentennummer?");
        int studentNummer = scanner.nextInt();
        for (int i = 0; i < Student.alleStudenten.size(); i++) {
            if (inlogNaam.equals(Student.alleStudenten.get(i).getNaam()) && (studentNummer == Student.alleStudenten.get(i).getNummer())) {
                unknown = false;
                System.out.println("U wordt ingelogd");
                System.out.println("Welke examen wilt u maken?" +
                        " 1: rekenen 2: wiskunde 3: programeren Voer nummer in");
                int welkeExamen = scanner.nextInt();
                if (welkeExamen == 1) {

                    examen = new Examen("rekenen",getRekenExamenVragen());
                    checkAntwoorden(examen, inlogNaam, studentNummer);
                } else if (welkeExamen == 2) {
                    examen = new Examen("wiskunde",addWiskundeExamenVragen());
                    checkAntwoorden(examen, inlogNaam, studentNummer);

                } else if (welkeExamen == 3) {
                    examen = new Examen("programming",addProgrammingExamenVragen());
                    checkAntwoorden(examen, inlogNaam, studentNummer);
                } else {
                    System.out.println("Examen bestaat niet");


                }
            }
        }
        if (unknown) {
            System.out.println("Ongeldige combinatie van naam en studentennummer!");
        }

    }

    //alle antwoorden worden gecheckt en op het scherm komt er te staan of de vraag fout of goed is
    private static void checkAntwoorden(Examen examen, String inlogNaam, int studentNummer) {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Je moet minimaal 3 vragen goed hebben voor een voldoende");
        for (i = 0; i < examen.getExamenVragen().size(); i++) {
            System.out.println(examen.getExamenVragen().get(i).getVraag());
            String antwoord = scanner.nextLine();
            if (examen.getExamenVragen().get(i).check(antwoord)) {
                System.out.println("Goed antwoordt");
                examen.setEindCijfer(examen.getEindCijfer()+ 2);
            } else {
                System.out.println("Fout antwoordt");
            }
        }
        if (examen.getEindCijfer() >= 5.5) {
            System.out.println("Student " + inlogNaam + " is geslaagd voor " + examen);
            Student student = Student.getStudentByName(inlogNaam);
            student.aantalExamens++;
        } else {
            System.out.println("Student " + inlogNaam + " is gezakt voor " + examen);

        }
        System.out.println("Cijfer: " + examen.getEindCijfer());
        Cijfer nieuwCijfer = new Cijfer(inlogNaam, studentNummer, examen.getExamen(), examen.getEindCijfer());
        Cijfer.Cijfers.add(nieuwCijfer);
    }

    //opvragen van de vragen van het Rekenexamen
    public static ArrayList<Vraag> getRekenExamenVragen() {


        ArrayList<Vraag> vragen = new ArrayList<>();
        Collections.addAll(
            vragen,
            new Vraag("Wat is 5 + 5","10"),
            new Vraag("Wat is 5 + 12","17"),
            new Vraag("Wat is 51 + 5","56"),
            new Vraag("Wat is 75 + 54","129"),
            new Vraag("Wat is 53 + 50","103")
        );
        return vragen;
    }

    //opvragen van de vragen van het WiskundeExamen
    public static ArrayList<Vraag> addWiskundeExamenVragen() {
        ArrayList<Vraag> vragen = new ArrayList<>();
        Collections.addAll(
                vragen,
                new Vraag("Wat is 10 + 5","15"),
                new Vraag("Wat is 5 + 112","117"),
                new Vraag("Wat is 51 + 5","56"),
                new Vraag("Wat is 75 + 54","129"),
                new Vraag("Wat is 53 + 50","103")
        );
        return vragen;

    }

    //opvragen van de vragen van het ProgrammingExamen
    public static ArrayList<Vraag> addProgrammingExamenVragen() {
        ArrayList<Vraag> vragen = new ArrayList<>();
        Collections.addAll(
                vragen,
                new Vraag("Welke datatype gebruik je om een naam op te slaan?","String"),
                new Vraag("Welke datatype gebruik je om een leeftijd op te slaan?","Int"),
                new Vraag("Welke datatype gebruik je om een logische voorwaarden op te slaan?","Boolean"),
                new Vraag("Welke datatype gebruik je om meer dan 7 decimalen achter de komma op te slaan?","Double"),
                new Vraag("Welke datatype gebruik je om meer dan 7 decimalen achter de komma op te slaan?","Float")

        );
        return vragen;
    }


}












