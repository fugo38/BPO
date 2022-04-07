package com.company;

import java.util.Scanner;

class Examen extends Main {
    private String examen;

    public Examen(String examen) {
        this.examen = examen;
    }

    public String getExamen() {
        return examen;

    }

    public static void addRekenExamen() {
        rekenVragen.add(new Vraag("Vraag 1: wat is 5 + 5", "10"));
        rekenVragen.add(new Vraag("Vraag 2: wat is 5 + 12", "17"));
        rekenVragen.add(new Vraag("Vraag 3: wat is 51 + 5", "56"));
        rekenVragen.add(new Vraag("Vraag 4: wat is 75 + 54", "129"));
        rekenVragen.add(new Vraag("Vraag 5: wat is 53 + 50", "103"));
    }

    public static void rekenExamen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Je moet minimaal 3 vragen goed hebben voor een voldoende");
        String examen = "Rekenen";
        double cijfer = 0;
        for (Vraag vraag : rekenVragen) {
            System.out.println(vraag.getVraag());
            String antwoord = scanner.next();
            if (vraag.getVraag().equals(vraag.getVraag()) && antwoord.equals(vraag.getAntwoord())) {
                System.out.println("Goed antwoordt");
                cijfer = cijfer + 2;
            } else {
                System.out.println("Fout antwoordt");
            }
        }
        if (cijfer >= 5.5) {
            System.out.println("Student " + inlogNaam + " is geslaagd voor " + examen);
        } else {
            System.out.println("Student " + inlogNaam + " is gezakt voor " + examen);

        }
        System.out.println("Cijfer: " + cijfer);
        Cijfers.add(new Cijfer(inlogNaam, studentNummer, examen, cijfer));
    }

    public static void addWiskundeExamen() {
        wiskundeVragen.add(new Vraag("vraag1: wat is 10 + 5", "15"));
        wiskundeVragen.add(new Vraag("vraag2: wat is 5 + 112", "117"));
        wiskundeVragen.add(new Vraag("vraag3: wat is 51 + 5", "56"));
        wiskundeVragen.add(new Vraag("vraag4: wat is 75 + 54", "129"));
        wiskundeVragen.add(new Vraag("vraag5: wat is 53 + 50", "103"));
    }

    public static void wiskundeExamen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Je moet minimaal 3 vragen goed hebben voor een voldoende");
        String examen = "Wiskunde";
        double cijfer = 0;
        for (Vraag vraag : wiskundeVragen) {
            System.out.println(vraag.getVraag());
            String antwoord = scanner.nextLine();
            if (vraag.getVraag().equals(vraag.getVraag()) && antwoord.equals(vraag.getAntwoord())) {
                System.out.println("Goed antwoordt");
                cijfer = cijfer + 2;
            } else {
                System.out.println("Fout antwoordt");
            }
        }
        if (cijfer >= 5.5) {
            System.out.println("Student " + inlogNaam + " is geslaagd voor " + examen);
        } else {
            System.out.println("Student " + inlogNaam + " is gezakt voor " + examen);

        }
        System.out.println("Cijfer: " + cijfer);
        Cijfers.add(new Cijfer(inlogNaam, studentNummer, examen, cijfer));
    }
    public static void addProgrammingExamen() {
        programmingVragen.add(new Vraag("Welke datatype gebruik je om een naam op te slaan?", "String"));
        programmingVragen.add(new Vraag("Welke datatype gebruik je om een leeftijd op te slaan?", "Int"));
        programmingVragen.add(new Vraag("Welke datatype gebruik je om een logische voorwaarden op te slaan?", "Boolean"));
        programmingVragen.add(new Vraag("Welke datatype gebruik je om meer dan 7 decimalen achter de komma op te slaan?", "Double"));
        programmingVragen.add(new Vraag("Welke datatype gebruik je om meer dan 7 decimalen achter de komma op te slaan?", "Float"));
    }
    public static void programmingExamen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Je moet minimaal 3 vragen goed hebben voor een voldoende");
        String examen = "Programming";
        double cijfer = 0;
        for (Vraag vraag : programmingVragen) {
            System.out.println(vraag.getVraag());
            String antwoord = scanner.nextLine();
            if (vraag.getVraag().equals(vraag.getVraag()) && antwoord.equalsIgnoreCase(vraag.getAntwoord())) {
                System.out.println("Goed antwoordt");
                cijfer = cijfer + 2;
            } else {
                System.out.println("Fout antwoordt");
            }
        }
        if (cijfer >= 5.5) {
            System.out.println("Student " + inlogNaam + " is geslaagd voor " + examen);
        } else {
            System.out.println("Student " + inlogNaam + " is gezakt voor " + examen);

        }
        System.out.println("Cijfer: " + cijfer);
        Cijfers.add(new Cijfer(inlogNaam, studentNummer, examen, cijfer));
    }

    public static void addExamenLijst() {
        Examens.add(new Examen("Rekenexamen"));
        Examens.add(new Examen("Wiskunde examen"));
        Examens.add(new Examen("Programming examen"));
    }

    public static void examenLijst() {

        for (int i = 0; i < Examens.size(); i++) {
            System.out.println(i + 1 + ". " + Examens.get(i).getExamen());
        }
    }
}