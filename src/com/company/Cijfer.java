package com.company;

class Cijfer extends Main {
    private String naam;
    private int studentenNummer;
    private String examen;
    private double cijfer;


    public Cijfer(String naam, int studentenNummer, String examen, double cijfer) {
        this.naam = naam;
        this.studentenNummer = studentenNummer;
        this.examen = examen;
        this.cijfer = cijfer;
    }
    public static void printCijfers() {
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
}