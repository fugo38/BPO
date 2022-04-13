package com.company;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class CijferTest {


    @Test
    void getCijfers() {
        ArrayList<Cijfer> cijfers = new ArrayList<>();
        Cijfer cijfer1 = new Cijfer("Mehmet", 21108730, "rekenen", 8);
        cijfers.add(cijfer1);
        assertNotNull(cijfers);
    }

    @Test
    void cijfersResultaat() {
        Student student = new Student("hans", 21108731);
        Cijfer cijfer1 = new Cijfer("Mehmet", 21108730, "rekenen", 8);
        assertNull(student);
        int studentenNummer = 21108730;

    }
}