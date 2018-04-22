package Calc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test8 {

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
         assertEquals("10.6",testingClass.getK(36, 11, 27.5));
      }
} 
