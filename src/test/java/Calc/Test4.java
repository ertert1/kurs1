package Calc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test4 {

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
        assertEquals("6.45",testingClass.getP(8, 1, 30, 27.5));
          }
} 
