package Calc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test7 {

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
        assertEquals("3.4",testingClass.getK(9, 7, 55));
      }
} 
