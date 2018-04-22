package Calc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test1 {

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
          }
} 
