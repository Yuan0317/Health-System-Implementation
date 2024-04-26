
/*
 * file name:BirthDate_Test.java
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
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;



/**
* Test class for testing the BirthDate class
* Uses JUnit version 5
* @author Yuan Tang
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - BirthDate")
@TestMethodOrder(OrderAnnotation.class)
public class BirthDate_Test {
	
	 private BirthDate birthDate;

	@BeforeEach
	void setUp() throws Exception {
		   birthDate = new BirthDate(1990, 1, 1);
	        System.out.println("Start a new test case:");
	}

	@AfterEach
	void tearDown() throws Exception {
		 birthDate = null;
	        System.out.println("Tear down a test case:");
	}

	/*		Methods to test
	 * 
		+BirthDate(day:int, month:int, year:int)
		+toString():String
		+formattedBirthDate():String
		+getDay():int
		+getMonth():int
		+getYear():int
	 */

	
	   @Test
	    @DisplayName("Constructor Test")
	    void testBirthDateConstructor() {
	        assertAll("Constructor",
	            () -> assertEquals(1990, birthDate.getYear(), "Year should match"),
	            () -> assertEquals(1, birthDate.getMonth(), "Month should match"),
	            () -> assertEquals(1, birthDate.getDay(), "Day should match")
	        );
	    }
	   
       @Test
        @DisplayName("toString()")
        void testToString() {
	           String expected = "level2Assignment1.BirthDate[year=1990, month=1, day=1]";
	           assertEquals(expected, birthDate.toString(), "The toString method should return the correct string representation of the BirthDate object");
	       }
       
     @Test
     @DisplayName("Formatted Birth Date Test")
    void testFormattedBirthDate() {
        String expected = "The birthdate is 1990/01/01";
        assertEquals(expected, birthDate.formattedBirthDate(), "Formatted birth date should match");
    }

	    @Test
	    @DisplayName("Get Day Test")
	    void testGetDay() {
	        assertEquals(1, birthDate.getDay(), "Day should match");
	    }
	
	    @Test
	    @DisplayName("Get Month Test")
	    void testGetMonth() {
	        assertEquals(1, birthDate.getMonth(), "Month should match");
	    }

	    @Test
	    @DisplayName("Get Year Test")
	    void testGetYear() {
	        assertEquals(1990, birthDate.getYear(), "Year should match");
	    }
}