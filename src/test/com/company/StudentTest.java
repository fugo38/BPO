package com.company;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class StudentTest {
    ArrayList<Student> alleStudenten = new ArrayList<Student>();
    @Test
    public void studentVerwijderen() {

        ArrayList<Student> alleStudenten = new ArrayList<Student>(
                Arrays.asList(new Student("PieterJan", 12345678),
                             (new Student("Henk", 12345679)))
        );
        int deleteNummer = 12345679;

        for (int i = 0; i < alleStudenten.size(); i++) {
            if (alleStudenten.get(i).getNummer() == deleteNummer) {
                System.out.println("Student " + alleStudenten.get(i).getNaam() + " | " + alleStudenten.get(i).getNummer() + " is verwijderd uit het systeem");
                alleStudenten.remove(i);
            }
        }
        assertEquals(alleStudenten.size(), 1);
        assertNotNull(alleStudenten);
    }

    @Test
    public void studentInschrijven() {
        int uniekNummer = 10;
        String naam = "Hans";
        ArrayList<Student> alleStudenten = new ArrayList<Student>();
        for (int i = 0; i < alleStudenten.size(); i++) {
            uniekNummer = uniekNummer + 1;
        }
        Student student = new Student(naam, uniekNummer);
        alleStudenten.add(student);
        System.out.println("Student " + naam + " is ingeschreven met studentennummer " + uniekNummer);

        assertEquals(alleStudenten.size(), 1);
        assertEquals(alleStudenten.get(0).getNaam() , "Hans");
        assertEquals(alleStudenten.get(0).getNummer() , 10);
        assertNotNull(alleStudenten);

    }




    @Test
    public void studentenLijst() {
        ArrayList<Student> alleStudenten = new ArrayList<Student>(
                Arrays.asList(new Student("PieterJan", 12345678),
                        (new Student("Mehmet", 12345679)))
        );
        assertNotNull(alleStudenten);
        assertEquals(alleStudenten.size(), 2);
        assertEquals(alleStudenten.get(0).getNaam(), "PieterJan");
    }

    @Test
    public void getStudentByName() {

        String naam = "Mehmet";
        boolean correct = false;
        Student student1 = new Student("Mehmet", 12345678);
        if (student1.getNaam() == naam) {
            correct = true;
        }
        assertTrue(correct);
        assertEquals(student1.getNaam(), naam);

    }

    @Test
    public void getMeesteExamens() {
        int meestaantal = 0;
        alleStudenten.add(new Student("Piet", 12345610));
        alleStudenten.add(new Student("Henk", 12345611));
        alleStudenten.add(new Student("Klaas", 12345612));
        alleStudenten.get(2).aantalExamens = 1;
        alleStudenten.get(1).aantalExamens = 2;
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
        assertEquals(meestaantal, alleStudenten.get(1).aantalExamens);
    }
}