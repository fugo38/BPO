package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class Cijfer {
    private String naam;
    private int studentenNummer;
    private String examen;
    private double cijfer;
    public static ArrayList<Cijfer> Cijfers = new ArrayList<>();

    Student student = new Student();

    public Cijfer(String naam, int studentenNummer, String examen, double cijfer) {
        this.naam = naam;
        this.studentenNummer = studentenNummer;
        this.examen = examen;
        this.cijfer = cijfer;
    }

    public Cijfer() {

    }

    //
    public void printCijfers() {
        System.out.println(Cijfers);
    }

    public String getNaam() {
        return naam;
    }

    public int getStudentenNummer() {
        return studentenNummer;
    }

    public String getExamen() {
        return examen;
    }

    public double getCijfer() {
        return cijfer;
    }

    public String toString() {
        return naam + " | " + studentenNummer + " | " + examen + " | " + cijfer + "\n";

    }
    public ArrayList<Cijfer> getCijfers() {
        return Cijfers;
    }

    //print alle examens die de aangegeven student gehaald heeft, of gezakt is en de cijfer die hij/zij ervoor heeft gehaald
    public void cijfersResultaat() {
        Scanner scanner = new Scanner(System.in);
        student.studentenLijst();
        System.out.println("Naam");
        String student = scanner.nextLine();
        System.out.println("Studentennummer");
        int studentenNummer = scanner.nextInt();
        if (Cijfers.size() == 0) {
            System.out.println("Student " + student + " heeft geen examens gemaakt");
        }
        for (int i = 0; i < Cijfers.size(); i++) {
            if (studentenNummer != Cijfers.get(i).getStudentenNummer() || !student.equalsIgnoreCase(Cijfers.get(i).getNaam())) {
                System.out.println("Student " + student + " heeft geen examens gemaakt");
            } else if (studentenNummer == Cijfers.get(i).getStudentenNummer()) {
                System.out.println("Student " + Cijfers.get(i).getNaam() + " | " + Cijfers.get(i).getStudentenNummer() + " heeft een " + Cijfers.get(i).getCijfer() + " gehaald voor " + Cijfers.get(i).getExamen());
                if (Cijfers.get(i).getCijfer() >= 5.5) {
                    System.out.println("Geslaagd");
                } else if (Cijfers.get(i).getCijfer() < 5.5) {
                    System.out.println("Gezakt");

                }
            }
        }
    }
}