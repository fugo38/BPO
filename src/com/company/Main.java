package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

class VraagAntwoord{
    private String vraag;
    private String antwoord;


    public VraagAntwoord(String vraag, String antwoord){
        this.vraag = vraag;
        this.antwoord = antwoord;
    }
    public String getVraag() {
        return vraag;
    }
    public String getAntwoord() {
        return antwoord;
    }

}
class Examen{
    private boolean geslaagd1;
    private boolean geslaagd2;

    public boolean getGeslaagd1() {
        return geslaagd1;
    }
    public boolean getGeslaagd2() {
        return geslaagd2;
    }


    public void setGeslaagd1(boolean geslaagd1) {
        this.geslaagd1 = geslaagd1;
    }
    public void setGeslaagd2(boolean geslaagd2) {
        this.geslaagd2 = geslaagd2;
    }

    private ArrayList<VraagAntwoord> examen1= new ArrayList<>();
    private ArrayList<VraagAntwoord> examen2= new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Examen(){
        initialiseerExamen1();
        initialiseerExamen2();
    }

    private ArrayList<VraagAntwoord> initialiseerExamen1(){
        examen1.add(new VraagAntwoord("vraag1: wat is 5 + 5", "10"));
        examen1.add(new VraagAntwoord("vraag2: wat is 5 + 12", "17"));
        examen1.add(new VraagAntwoord("vraag3: wat is 51 + 5", "56"));
        examen1.add(new VraagAntwoord("vraag4: wat is 75 + 54", "129"));
        examen1.add(new VraagAntwoord("vraag5: wat is 53 + 50", "103"));

        return examen1;
    }

    private ArrayList<VraagAntwoord> initialiseerExamen2(){
        examen2.add(new VraagAntwoord("vraag1: wat is 10 + 5", "15"));
        examen2.add(new VraagAntwoord("vraag2: wat is 5 + 112", "117"));
        examen2.add(new VraagAntwoord("vraag3: wat is 51 + 5", "56"));
        examen2.add(new VraagAntwoord("vraag4: wat is 75 + 54", "129"));
        examen2.add(new VraagAntwoord("vraag5: wat is 53 + 50", "103"));

        return examen2;
    }

    public void printExamen1(Student student){
        int punten = 0;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < examen1.size(); i++){
            System.out.println(examen1.get(i).getVraag());
            String antwoord = scanner.nextLine();

            if(antwoord.equals(examen1.get(i).getAntwoord())){
                punten++;
            }
        }
        if(punten >= 3){
            setGeslaagd1(true);
            System.out.println("je bent geslaagd");
            int aantalgeslaagd = student.getGeslaagdAantal();
            int aa = aantalgeslaagd+1;
            student.setGeslaagdAantal(aa);
            System.out.println(aa);
        }
        else{
            System.out.println("je bent gezakt, volgende keer beter");
        }
    }

    public void printExamen2(Student student){
        int punten = 0;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < examen2.size(); i++){
            System.out.println(examen2.get(i).getVraag());
            String antwoord = scanner.nextLine();

            if(antwoord.equals(examen2.get(i).getAntwoord())){
                punten++;
            }
        }
        if(punten >= 3){
            setGeslaagd1(true);
            System.out.println("je bent geslaagd");
            int aantalgeslaagd = student.getGeslaagdAantal();
            int aa = aantalgeslaagd+1;
            student.setGeslaagdAantal(aa);
            System.out.println(aa);
        }
        else{
            System.out.println("je bent gezakt, volgende keer beter");
        }
    }

}

class Student{

    private int GeslaagdAantal=0;
    private static ArrayList<Student> alleStudenten = new ArrayList<>();
    private String naam;
    private static int studentNummerId = 20220317;
    private int nummer;
    private Student ingelogdestudent;
    public Student(String naam) {

        this.naam = naam;
        this.nummer = uniekNummer();

    }

    public int getGeslaagdAantal() {
        return GeslaagdAantal;
    }

    public void setGeslaagdAantal(int geslaagdAantal) {
        GeslaagdAantal = geslaagdAantal;
    }

    public String getNaam() {
        return naam;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public void setIngelogdestudent(Student ingelogdestudent) {
        this.ingelogdestudent = ingelogdestudent;
    }

    public static ArrayList<Student> addStudent() {
        alleStudenten.add(new Student("Mehmet"));
        alleStudenten.add(new Student("Turan"));
        alleStudenten.add(new Student("Furkan"));
        alleStudenten.add(new Student("Nazih"));
        alleStudenten.add(new Student("Mohammed"));
        return alleStudenten;
    }

    @Override
    public String toString() {
        return ("Student naam: "+this.getNaam()+
                " Student No: "+ this.getNummer());
    }

    public static void printStudenten() {

        for (int i=0; i<alleStudenten.size(); i++) {
            System.out.println(alleStudenten.get(i).toString());
        }
    }

    public static void studentMaken() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wat is uw naam?");
        String naam = scanner.nextLine();
        int uniekNummer = 21234567;
        for (int i = 0; i < alleStudenten.size(); i++) {
            uniekNummer = uniekNummer + 1;
        }
        alleStudenten.add(new Student(naam));
        System.out.println("Student " + naam + " is aangemaakt");
    }
    public static void studentenLijst() {
        for (int i = 0; i < alleStudenten.size(); i++) {
            System.out.println(i + 1 + ". " + alleStudenten.get(i).naam + ", " + alleStudenten.get(i).nummer);
        }
    }

    public static void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welke student wil je verwijderen?");
        String delete = scanner.nextLine();
        for (int i = 0; i < alleStudenten.size(); i++) {
            if (alleStudenten.get(i).naam.equals(delete)) {
                alleStudenten.remove(i);
            }
        }
    }

    public static Student inloggen() {
        Student ingelogdeStudent;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wat is uw naam?");
        String naam = scanner.nextLine();
        System.out.println("Wat is uw studentennummer?");
        int studentenNummer = scanner.nextInt();
        boolean b = false;
        for (int i = 0; i < alleStudenten.size(); i++) {
            String aa= alleStudenten.get(i).naam;
            int bb = alleStudenten.get(i).nummer;
            if (naam.equalsIgnoreCase(aa) && studentenNummer == bb) {
                System.out.println("U wordt ingelod");
                b = true;
                return  alleStudenten.get(i);
            }
        }
        if (!b){
            System.out.println("Ongeldige combinatie van naam en studentennummer");
            b = true;
            System.out.println("Wat is uw naam?");
            naam = scanner.next();
            System.out.println("Wat is uw studentennummer?");
            studentenNummer = scanner.nextInt();
        }
        return null;
    }

    private static Integer uniekNummer(){
        int nummer = studentNummerId;
        studentNummerId++;
        return nummer;
    }
}

public class Main {
    public static void main(String[] args) {
        Student.addStudent();
        Student.printStudenten();
//        Student.studentMaken();
        Student ingelogde =  Student.inloggen();
        Examen examen1 = new Examen();
        Examen examen2 = new Examen();
        Scanner scanner = new Scanner(System.in);
        System.out.println("kies 1: examen1");
        System.out.println("kies 2: examen2");
        int keuze = scanner.nextInt();
        if (keuze == 1){
            examen1.printExamen1(ingelogde);
        }
        if (keuze == 2){
            examen2.printExamen2(ingelogde);
        }
//        System.out.println("kies 1: examen1");
//        System.out.println("kies 2: examen2");
//        int keuze2 = scanner.nextInt();
//        if (keuze2 == 1){
//            examen1.printExamen1(ingelogde);
//        }
//        if (keuze2 == 2){
//            examen2.printExamen2(ingelogde);
//        }


    }
}