package Calc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class korporateCalcTest {

    korporateCalc testingClass;

    @BeforeEach
   void setUp() {
        testingClass = new korporateCalc();
    }

   @AfterEach
   void tearDown() {
        testingClass = null;
   }

    @Test
    void getP() {
        assertEquals("47.25",testingClass.getP(12, 16, 45, 5.6));
        assertEquals("391.02",testingClass.getP(10, 14, 52, 55));
        assertEquals("67.68",testingClass.getP(14, 2, 90, 27.5));     
	assertEquals("6.45",testingClass.getP(8, 1, 30, 27.5));
    }
} 
