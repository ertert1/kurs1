package Calc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class physhicalCalcTest {

    physhicalCalc testingClass;

    @BeforeEach
    void setUp() {
        testingClass = new physhicalCalc();
    }

   @AfterEach
    void tearDown() {
        testingClass = null;
    }

    @Test
    void getK() {
        assertEquals("5.8",testingClass.getK(6, 36, 27.5));
        assertEquals("3.5",testingClass.getK(40, 16, 5.6));
        assertEquals("3.4",testingClass.getK(9, 7, 55));
        assertEquals("10.6",testingClass.getK(36, 11, 27.5));
    }
} 
