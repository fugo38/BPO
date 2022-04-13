package com.company;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

class Student {
    private String naam;
    private int nummer;
    private static int uniekNummer = 21234567;
    public static ArrayList<Student> alleStudenten = new ArrayList<Student>(
            Arrays.asList(new Student("PieterJan", uniekNummer))
    );
    public int aantalExamens=0;

    public Student(String naam, int studentenNummer) {
        this.naam = naam;
        this.nummer = studentenNummer;
        if(naam.equals("PieterJan")){
            aantalExamens = 1;
        }
    }

    public Student() {

    }

    public int getAantalExamens() {
        return aantalExamens;
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
    public static Student getStudentByName(String naam){
        for(int i =0; i<alleStudenten.size();i++){
            Student student = new Student();
            if(alleStudenten.get(i).naam.equals(naam)){
                student = alleStudenten.get(i);
                return student;
            }
        }
        return null;
    }

    public static void getMeesteExamens(){
        int meestaantal = 0;
        ArrayList<Student> MeestGemaakteExamensStudenten = new ArrayList<>();
        for(int i =0; i<alleStudenten.size();i++){
            if(alleStudenten.get(i).aantalExamens>meestaantal){
                meestaantal = alleStudenten.get(i).aantalExamens;
            }
        }
        for(int i =0; i<alleStudenten.size();i++){
            if(alleStudenten.get(i).aantalExamens==meestaantal){
                MeestGemaakteExamensStudenten.add(alleStudenten.get(i));
            }
        }
        System.out.println("De student(en) met de meeste behaalde examens:");
        for (Student student:MeestGemaakteExamensStudenten) {
            System.out.println(student.naam+" heeft "+student.aantalExamens+" examens behaald.");
        }
    }
}


