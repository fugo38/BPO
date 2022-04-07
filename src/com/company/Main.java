package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import static com.company.Student.*;
import static com.company.Examen.*;
import static com.company.Cijfer.*;
import static com.company.Menu.*;

public class Main {
    protected static String inlogNaam;
    protected static int studentNummer;
    protected static int commandnummer;
    protected static boolean nogEenKeer;

    protected static ArrayList<Examen> Examens = new ArrayList<>();
    protected static ArrayList<Vraag> rekenVragen = new ArrayList<>();
    protected static ArrayList<Vraag> wiskundeVragen = new ArrayList<>();
    protected static ArrayList<Vraag> programmingVragen = new ArrayList<>();
    protected static ArrayList<Cijfer> Cijfers = new ArrayList<>();
    protected static ArrayList<Student> alleStudenten = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println();
        addMenu();
        addExamenLijst();
        addRekenExamen();
        addWiskundeExamen();
        addProgrammingExamen();
        nogEenKeer = true;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("[Controle paneel]");
                printMenu();
                System.out.println("Voer een commandnummer in");
                commandnummer = scanner.nextInt();
                if (commandnummer == 1) {
                    System.out.println("Studentenlijst");
                    studentenLijst();
                } else if (commandnummer == 2) {
                    System.out.println("Examenlijst");
                    examenLijst();
                    System.out.println("________________");
                } else if (commandnummer == 3) {
                    System.out.println("Student inschrijven");
                    studentInschrijven();
                    System.out.println("________________");
                } else if (commandnummer == 4) {
                    System.out.println("Student verwijderen");
                    studentVerwijderen();
                    System.out.println("________________");
                } else if (commandnummer == 5) {
                    System.out.println("Log in voordat je een examen kan afnemen");
                    studentInloggen();
                    System.out.println("________________");
                } else if (commandnummer == 6) {
                    System.out.println("Welke student wil je opzoeken?");
                    studentGeslaagd();
                    System.out.println("________________");
                } else if (commandnummer == 7) {
                    System.out.println("Welke student heeft de meeste examens gehaald?");
                    printCijfers();
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












