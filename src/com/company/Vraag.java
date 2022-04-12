package com.company;

import java.util.ArrayList;
import java.util.Locale;

class Vraag {
    private String vraag;
    private String antwoord;

    public ArrayList<Vraag> rekenVragen = new ArrayList<>();
    public ArrayList<Vraag> wiskundeVragen = new ArrayList<>();
    public ArrayList<Vraag> programmingVragen = new ArrayList<>();


    public Vraag(String vraag, String antwoord) {
        this.vraag = vraag;
        this.antwoord = antwoord;
    }

    public Vraag() {

    }

    public String getVraag() {
        return vraag;
    }

    public String getAntwoord() {
        return antwoord;
    }
    public ArrayList<Vraag> getRekenVragen() {
        return rekenVragen;
    }

    public ArrayList<Vraag> getWiskundeVragen() {
        return wiskundeVragen;
    }

    public ArrayList<Vraag> getProgrammingVragen() {
        return programmingVragen;
    }
//    public void addRekenExamenVragen() {
//
//        Vraag rekenVraag1 = new Vraag("Wat is 5 + 5","10");
//        Vraag rekenVraag2 = new Vraag("Wat is 5 + 12","17");
//        Vraag rekenVraag3 = new Vraag("Wat is 51 + 5","56");
//        Vraag rekenVraag4 = new Vraag("Wat is 75 + 54","129");
//        Vraag rekenVraag5 = new Vraag("Wat is 53 + 50","103");
//
//        rekenVragen.add(rekenVraag1);
//        rekenVragen.add(rekenVraag2);
//        rekenVragen.add(rekenVraag3);
//        rekenVragen.add(rekenVraag4);
//        rekenVragen.add(rekenVraag5);
//
//    }
//    public void addWiskundeExamenVragen() {
//        Vraag wiskundeVraag1 = new Vraag("Wat is 10 + 5","15");
//        Vraag wiskundeVraag2 = new Vraag("Wat is 5 + 112","117");
//        Vraag wiskundeVraag3 = new Vraag("Wat is 51 + 5","56");
//        Vraag wiskundeVraag4 = new Vraag("Wat is 75 + 54","129");
//        Vraag wiskundeVraag5 = new Vraag("Wat is 53 + 50","103");
//
//        wiskundeVragen.add(wiskundeVraag1);
//        wiskundeVragen.add(wiskundeVraag2);
//        wiskundeVragen.add(wiskundeVraag3);
//        wiskundeVragen.add(wiskundeVraag4);
//        wiskundeVragen.add(wiskundeVraag5);
//
//    }
//    public void addProgrammingExamenVragen() {
//
//        Vraag programmingVraag1 = new Vraag("Welke datatype gebruik je om een naam op te slaan?","String");
//        Vraag programmingVraag2 = new Vraag("Welke datatype gebruik je om een leeftijd op te slaan?","Int");
//        Vraag programmingVraag3 = new Vraag("Welke datatype gebruik je om een logische voorwaarden op te slaan?","Boolean");
//        Vraag programmingVraag4 = new Vraag("Welke datatype gebruik je om meer dan 7 decimalen achter de komma op te slaan?","Double");
//        Vraag programmingVraag5 = new Vraag("Welke datatype gebruik je om meer dan 7 decimalen achter de komma op te slaan?","Float");
//
//        programmingVragen.add(programmingVraag1);
//        programmingVragen.add(programmingVraag2);
//        programmingVragen.add(programmingVraag3);
//        programmingVragen.add(programmingVraag4);
//        programmingVragen.add(programmingVraag5);
//
//    }

    public boolean check (String antwoord){
        return this.getAntwoord().toLowerCase(Locale.ROOT).equals(antwoord.toLowerCase(Locale.ROOT));
    }
}
