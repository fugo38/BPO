package com.company;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void studentVerwijderen() {
    }

    @Test
    public void studentInschrijven() {
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
    }
}