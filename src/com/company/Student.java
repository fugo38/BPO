package com.company;

import java.util.Scanner;
import static com.company.Examen.*;

class Student extends Main {
    private final String naam;
    private final int nummer;

    public Student(String naam, int studentenNummer) {
        this.naam = naam;
        this.nummer = studentenNummer;
    }
    public String getNaam() {
        return naam;
    }
    public int getNummer() {
        return nummer;
    }

    public static void studentInloggen() {
        Scanner scanner = new Scanner(System.in);
        boolean unknown = true;
        System.out.println("Wat is uw naam?");
        inlogNaam = scanner.nextLine();
        System.out.println("Wat is uw studentennummer?");
        studentNummer = scanner.nextInt();
        for (Student student : alleStudenten) {
            if (inlogNaam.equals(student.naam) && (studentNummer == student.nummer)) {
                unknown = false;
                System.out.println("U wordt ingelogd");
                examenLijst();
                System.out.println("""
                        Welke examen wilt u maken?
                        Voer nummer in""");
                int welkeExamen = scanner.nextInt();
                if (welkeExamen == 1) {
                    rekenExamen();
                } else if (welkeExamen == 2) {
                    wiskundeExamen();
                } else if (welkeExamen == 3) {
                    programmingExamen();
                } else {
                    System.out.println("Examen bestaat niet");
                }
            }
        }
        if (unknown) {
            System.out.println("Ongeldige combinatie van naam en studentennummer!");
        }
    }
    public static void studentVerwijderen() {
        Scanner scanner = new Scanner(System.in);
        studentenLijst();
        System.out.println("Welke student wil je verwijderen?");
        System.out.println("Studentennummer");
        boolean delete = false;
        int i;
        int deleteNummer = scanner.nextInt();
        for (i = 0; i < alleStudenten.size(); i++) {
            if (alleStudenten.get(i).getNummer() == deleteNummer) {
                System.out.println("Student " + alleStudenten.get(i).getNaam() + " | " + alleStudenten.get(i).getNummer() + " is verwijderd uit het systeem");
                alleStudenten.remove(i);
                delete = true;
            }
        }
        if (!delete) {
            System.out.println("Ongeldige studentennummer");
        }
    }
    public static void studentInschrijven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Naam");
        String naam = scanner.nextLine();
        int uniekNummer = 21234567;
        for (int i = 0; i < alleStudenten.size(); i++) {
            uniekNummer = uniekNummer + 1;
        }
        alleStudenten.add(new Student(naam, uniekNummer));
        System.out.println("Student " + naam + " is ingeschreven met studentennummer " + uniekNummer);
    }
    public static void studentenLijst() {
        for (int i = 0; i < alleStudenten.size(); i++) {
            System.out.println(i + 1 + ". " + alleStudenten.get(i).getNaam() + " | " + alleStudenten.get(i).nummer);
        }
    }
    public static void studentGeslaagd() {
        Scanner scanner = new Scanner(System.in);
        studentenLijst();
        System.out.println("Naam");
        String student = scanner.nextLine();
        System.out.println("Studentennummer");
        int studentenNummer = scanner.nextInt();
        if (Cijfers.size() == 0) {
            System.out.println("Student " + student + " heeft geen examens gemaakt");
        }
        for (Cijfer cijfer : Cijfers) {
            if (studentenNummer != cijfer.getStudentenNummer() || !student.equalsIgnoreCase(cijfer.getNaam())) {
                System.out.println("Student " + student + " heeft geen examens gemaakt");
            } else if (studentenNummer == cijfer.getStudentenNummer()) {
                System.out.println("Student " + cijfer.getNaam() + " | " + cijfer.getStudentenNummer() + " heeft een " + cijfer.getCijfer() + " gehaald voor " + cijfer.getExamen());
                if (cijfer.getCijfer() >= 5.5) {
                    System.out.println("Geslaagd");
                } else if (cijfer.getCijfer() < 5.5) {
                    System.out.println("Gezakt");
                }
            }
        }
    }
}