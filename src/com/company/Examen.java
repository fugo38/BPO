package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class Examen {
    public int eindCijfer = 0;
    private String Examen;
    private ArrayList<Vraag> examenVragen;
    public ArrayList<Examen> Examens = new ArrayList<>();

    Student student = new Student();
    Cijfer cijfer = new Cijfer();
    Vraag vraag = new Vraag();

    private Examen rekenen;
    private Examen wiskunde;
    private Examen programming;


    public Examen(String examen, ArrayList<Vraag> examenVragen) {
        this.Examen = examen;
        this.examenVragen = examenVragen;
        rekenen = new Examen("Rekenen", vraag.rekenVragen);
        wiskunde = new Examen("Wiskunde",vraag.wiskundeVragen);
        programming = new Examen("Programming",vraag.programmingVragen);
    }

    public String getExamen() {
        return Examen;

    }

    public Examen(){}

    public ArrayList<Vraag> getExamenVragen() {
        return examenVragen;
    }
    public ArrayList<Examen> getExamens() {
        return Examens;
    }

    public void runExamen(Examen examen) {
        Scanner scanner = new Scanner(System.in);
        boolean unknown = true;
        System.out.println("Wat is uw naam?");
        String inlogNaam = scanner.nextLine();
        System.out.println("Wat is uw studentennummer?");
        int studentNummer = scanner.nextInt();
        int i;
        for (i = 0; i < student.alleStudenten.size(); i++) {
            if (inlogNaam.equals(student.alleStudenten.get(i).getNaam()) && (studentNummer == student.alleStudenten.get(i).getNummer())) {
                unknown = false;
                System.out.println("U wordt ingelogd");
                System.out.println("""
                        Welke examen wilt u maken?
                        Voer nummer in""");
                int welkeExamen = scanner.nextInt();
                if (welkeExamen == 1) {
                    runExamen(rekenen);
                } else if (welkeExamen == 2) {
                    runExamen(wiskunde);
                } else if (welkeExamen == 3) {
                    runExamen(programming);
                } else {
                    System.out.println("Examen bestaat niet");
                }
            }
        }
        if (unknown) {
            System.out.println("Ongeldige combinatie van naam en studentennummer!");
        }
        for (i = 0; i < Examens.size(); i++) {
            if (!unknown && examen.equals(Examens.get(i))) {
                System.out.println("Je moet minimaal 3 vragen goed hebben voor een voldoende");
                for (i = 0; i < Examens.get(i).getExamenVragen().size(); i++) {
                    System.out.println(vraag.getVraag());
                    String antwoord = scanner.nextLine();
                    if (examenVragen.get(i).getVraag().equals(examenVragen.get(i).getVraag()) && antwoord.equalsIgnoreCase(examenVragen.get(i).getAntwoord())) {
                        System.out.println("Goed antwoordt");
                        eindCijfer = eindCijfer + 2;
                    } else {
                        System.out.println("Fout antwoordt");
                    }
                }
                if (eindCijfer >= 5.5) {
                    System.out.println("Student " + inlogNaam + " is geslaagd voor " + examen);
                } else {
                    System.out.println("Student " + inlogNaam + " is gezakt voor " + examen);

                }
                System.out.println("Cijfer: " + eindCijfer);
                Cijfer nieuwCijfer = new Cijfer(inlogNaam, studentNummer, examen.getExamen(), eindCijfer);
                cijfer.Cijfers.add(nieuwCijfer);

            }
        }
    }

    public void addExamenLijst() {

        Examens.add(rekenen);
        Examens.add(wiskunde);
        Examens.add(programming);

    }

    public void examenLijst() {
        for (int i = 0; i < Examens.size(); i++) {
            System.out.println(i + 1 + ". " + Examens.get(i).getExamen());
        }
    }
}