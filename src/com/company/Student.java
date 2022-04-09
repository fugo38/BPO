package com.company;


import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String naam;
    private int nummer;
    private static int uniekNummer = 21234567;
    public ArrayList<Student> alleStudenten = new ArrayList<>();

    public Student(String naam, int studentenNummer) {
        this.naam = naam;
        this.nummer = studentenNummer;

    }

    public Student() {

    }

    public String getNaam() {
        return naam;
    }

    public int getNummer() {
        return nummer;
    }

    public void studentVerwijderen() {
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

    public void studentInschrijven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Naam");
        String naam = scanner.nextLine();
        for (int i = 0; i < alleStudenten.size(); i++) {
            uniekNummer = uniekNummer + 1;
        }
        Student student = new Student(naam, uniekNummer);
        alleStudenten.add(student);
        System.out.println("Student " + naam + " is ingeschreven met studentennummer " + uniekNummer);
    }

    public void studentenLijst() {
        for (int i = 0; i < alleStudenten.size(); i++) {
            System.out.println(i + 1 + ". " + alleStudenten.get(i).getNaam() + " | " + alleStudenten.get(i).nummer);
        }
    }
}


