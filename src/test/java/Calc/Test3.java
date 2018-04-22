package Calc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test3 {

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
              assertEquals("391.02",testingClass.getP(10, 14, 52, 55));
           }
    } 
