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

    public boolean check (String antwoord){
        return this.getAntwoord().toLowerCase(Locale.ROOT).equals(antwoord.toLowerCase(Locale.ROOT));
    }
}
