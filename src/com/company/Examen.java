package com.company;
import jdk.internal.org.objectweb.asm.tree.analysis.SourceValue;

import java.util.ArrayList;


class VraagAntwoord {
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

    public void setVraag(String vraag) {
        this.vraag = vraag;
    }

    public void setAntwoord(String antwoord) {
        this.antwoord = antwoord;
    }
}
class Examen{
    private static ArrayList<VraagAntwoord> examen1= new ArrayList<>();
    private static ArrayList<VraagAntwoord> examen2= new ArrayList<>();

    private static ArrayList<VraagAntwoord> initialiseerExamen1(){
        examen1.add(new VraagAntwoord("vraag1: wat is 5 + 5", "10"));
        examen1.add(new VraagAntwoord("vraag2: wat is 5 + 12", "17"));
        examen1.add(new VraagAntwoord("vraag3: wat is 51 + 5", "56"));
        examen1.add(new VraagAntwoord("vraag4: wat is 75 + 54", "129"));
        examen1.add(new VraagAntwoord("vraag5: wat is 53 + 50", "103"));

        return examen1;
    }

    public static ArrayList<VraagAntwoord> initialiseerExamen2(){
        examen1.add(new VraagAntwoord("vraag1: wat is 5 + 5", "10"));
        examen1.add(new VraagAntwoord("vraag2: wat is 5 + 12", "17"));
        examen1.add(new VraagAntwoord("vraag3: wat is 51 + 5", "56"));
        examen1.add(new VraagAntwoord("vraag4: wat is 75 + 54", "129"));
        examen1.add(new VraagAntwoord("vraag5: wat is 53 + 50", "103"));

        return examen2;
    }

    private static void printExamen1(ArrayList<VraagAntwoord> examen1){
    }



}

class Main2 {
    


}
