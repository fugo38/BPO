package com.company;

import java.util.ArrayList;

class Examen {
    private int eindCijfer = 0;
    private String examen;
    private ArrayList<Vraag> examenVragen;

    public int getEindCijfer() {
        return eindCijfer;
    }

    public void setEindCijfer(int eindCijfer) {
        this.eindCijfer = eindCijfer;
    }

    Student student = new Student();
    Cijfer cijfer = new Cijfer();

    public Examen(String examen, ArrayList<Vraag> examenVragen) {
        this.examen = examen;
        this.examenVragen = examenVragen;

    }

    public String getExamen() {
        return examen;

    }
    // methode om te vragen van alle vragen die bij een bepaald examen hoort
    public ArrayList<Vraag> getExamenVragen() {
        return examenVragen;
    }
}