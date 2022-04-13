package com.company;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class CijferTest {

//    @Test
//    void printCijfers() {
//    }
//
//    @Test
//    void getNaam() {
//    }
//
//    @Test
//    void getStudentenNummer() {
//    }
//
//    @Test
//    void getExamen() {
//    }
//
//    @Test
//    void getCijfer() {
//    }
//
//    @Test
//    void testToString() {
//    }

    @Test
    void getCijfers() {
        ArrayList<Cijfer> cijfers = new ArrayList<>();
        Cijfer cijfer1 = new Cijfer("Mehmet", 21108730, "rekenen", 8);
        cijfers.add(cijfer1);
        assertNotNull(cijfers);
    }

//    @Test
//    void cijfersResultaat() {
//    }
}