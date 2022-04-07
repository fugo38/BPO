package com.company;

class Vraag extends Main{
    private final String vraag;
    private final String antwoord;
    public Vraag(String vraag, String antwoord) {
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