/*
 * file name:MedicalCalculator.java
 * Author:Yuan Tang 041128167
 * course:CST8284 
 * assignment:1
 * date:2/28/2024
 * professor:Reg
 * class list:311
 */
package level2Assignment1;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


/**
* Test class for testing the MedicalCalculator class
* Uses JUnit version 5
* @author Yuan Tang
* @version 1.0.0
*/@DisplayName("Test My HealthCare Application Domain - MedicalCalculator")
@TestMethodOrder(OrderAnnotation.class)
public class MedicalCalculator_Test {

    @Nested
    @DisplayName("calculateBMI() Test")
    @TestMethodOrder(OrderAnnotation.class)
    class calculateBMITest {

        @Test
        @Order(1)
        @DisplayName("calculateBMI() test with 0 arguments")
        final void testCalculateBMIWithZeroValues() {
            double result = MedicalCalculator.calculateBMI(0,0);
            assertTrue(Double.isNaN(result), "BMI calculation with zero values should be NaN");
        }
        
        @Test
        @Order(2)
        @DisplayName("calculateBMI() test with height = 0")
        final void testCalculateBMIWithHeightZero() {
            double result = MedicalCalculator.calculateBMI(165.0, 0.0);
            assertEquals(Double.POSITIVE_INFINITY, result, "BMI calculation with height 0 should be positive infinity");
        }

        @Test
        @Order(3)
        @DisplayName("calculateBMI() test with weight = 0")
        final void testCalculateBMIWithWeightZero() {
            double result = MedicalCalculator.calculateBMI(0.0, 69.0);
            assertEquals(0.0, result, "BMI calculation with weight 0 should be 0");
        }

        @Test
        @Order(4)
        @DisplayName("calculateBMI() test with valid arguments")
        final void testCalculateBMIWithValidArguments() {
            double result = MedicalCalculator.calculateBMI(165.0, 69.0);
            double expected = 24.36; // This expected value might need adjustment based on the correct formula and precision
            assertEquals(expected, result, 0.01, "BMI calculation with valid arguments should match expected value.");
        }
        
        @Test
        @Order(5)
        @DisplayName("incorrectBMI() test with valid arguments")
        final void testincorrectBMIWithvalidValues() {
            double result = MedicalCalculator.calculateBMI(165.0,69.0);
            double expected = 24.38;
            assertEquals(expected, result, "BMI calculation with valid arguments should match expected value.");
        }
        
        
    }
}
