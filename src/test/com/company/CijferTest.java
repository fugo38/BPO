package com.company;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class CijferTest {

    @Test
    void getCijfers() {
        ArrayList<Cijfer> cijfers = new ArrayList<>();
        Cijfer cijfer1 = new Cijfer("Mehmet", 21108730, "rekenen", 8);
        cijfers.add(cijfer1);
        assertNotNull(cijfers);
        assertEquals(cijfers.get(0).getCijfer(), cijfer1.getCijfer());
        assertEquals(cijfers.get(0).getExamen(), cijfer1.getExamen());
        assertEquals(cijfers.get(0).getStudentenNummer(), cijfer1.getStudentenNummer());
        assertEquals(cijfers.get(0).getNaam(), cijfer1.getNaam());

    }

    @Test
    void cijfersResultaat() {
        Cijfer cijfer1 = new Cijfer("Furkan", 21108731, "rekenen", 8);
        Cijfer cijfer2 = new Cijfer("Furkan", 21108731, "rekenen", 2);
        boolean gehaald = false;
        boolean gehaald2 = true;
        if (cijfer1.getCijfer() >= 5.5) {
            gehaald = true;
        } else if (cijfer1.getCijfer() < 5.5) {
            gehaald = false;
        }
        assertTrue(gehaald);
        if (cijfer2.getCijfer() >= 5.5) {
            gehaald2 = true;
        } else if (cijfer2.getCijfer() < 5.5) {
            gehaald2 = false;
        }
        assertFalse(gehaald2);

    }
}