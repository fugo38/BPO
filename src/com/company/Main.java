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

    public void printExamen1(){
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
        }
        else{
            System.out.println("je bent gezakt, volgende keer beter");
        }
    }

    public void printExamen2(){
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
        }
        else{
            System.out.println("je bent gezakt, volgende keer beter");
        }
    }

}

class Student{

    private static ArrayList<Student> alleStudenten = new ArrayList<>();
    private String naam;
    private static int studentNummerId = 20220317;
    private int nummer;

    public Student(String naam) {

        this.naam = naam;
        this.nummer = uniekNummer();
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

    public static ArrayList<Student> addStudent() {
        alleStudenten.add(new Student("Mehmet"));
        alleStudenten.add(new Student("Turan"));
        alleStudenten.add(new Student("Furkan"));
        alleStudenten.add(new Student("Nazih"));
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

    public static void inloggen() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wat is uw naam?");
        String username = sc.nextLine();
//        System.out.println("Wat is uw student nummer?");
//        int studentId = sc.nextInt();
        for (int i=0; i < addStudent().size(); i++) {
            if (alleStudenten.get(i).getNaam().equals(username)) {
                System.out.println("ingelogged");
            }
        }
    }

    private static Integer uniekNummer(){
        int nummer = studentNummerId;
        studentNummerId++;
        return nummer;
    }
}

public class Main {
    public static void main(String[] args) {
//        Student student1 = new Student("Mehmet");
//        Student student2 = new Student("Furkan");
//        System.out.println(student1);
//        System.out.println(student2);
//        Student.printStudenten();
        Examen examen1 = new Examen();
        Examen examen2 = new Examen();
        Scanner scanner = new Scanner(System.in);
        System.out.println("kies 1: examen1");
        System.out.println("kies 2: examen2");
        int keuze = scanner.nextInt();
        if (keuze == 1){
            examen1.printExamen1();
        }
        if (keuze == 2){
            examen2.printExamen2();
        }
    }
}
