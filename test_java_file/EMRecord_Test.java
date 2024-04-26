
/*
 * file name:EMRecord_Test.java
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
* Test class for testing the EMRecord class
* Uses JUnit version 5
* @author Yuan Tang
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - EMRecord")
@TestMethodOrder(OrderAnnotation.class)
public class EMRecord_Test {
	
	private EMRecord person;

	@BeforeEach
	void setUp() throws Exception {
		person=new EMRecord("ON","s0411","52","h520",6,50);

	}

	@AfterEach
	void tearDown() throws Exception {
		person=null;
	}

	/*		Methods to test
	 * 
		+EMRecord(reportingFacilityProvince:String, institutionNumber:String, chartNumber:String,healthCareNumber:String)
		+toString():String
		+setName(name:Name):void
		+setAddress(address:Address):void
		+setHeight():void
		+getHeight():int
		+setWeight():void
		+getWeight():int
		+formattedName():String
		+formattedAddress():String
		+bmi():int
	 */

	
    @Nested
    @DisplayName("Constructor Test")
    class ConstructorTests {
        @Test
        @DisplayName("EMRecord() with valid arguments")
        void testEMRecordWithValidArguments() {
            assertNotNull(person, "Person should not be null with valid constructor arguments");
        }
    }


    @Nested
    @DisplayName("toString Method Test")
    class ToStringTest {
        @Test
        @DisplayName("toString")
        void testToStringMethod() {
            String toStringResult = person.toString();
            assertNotNull(toStringResult, "toString should return a non-null string representation of EMRecord");
            assertTrue(toStringResult.contains("ON") && toStringResult.contains("s0411"), "toString output should contain parts of the EMRecord");
        }
    }
	

    @Nested
    @DisplayName("Setter and Getter Tests")
    class SetterGetterTests {
        @Test
        @DisplayName("Height Getter and Setter")
        void testHeightGetterSetter() {
            person.setHeight(180);
            assertEquals(180, person.getHeight(), "Height should be updated to 180");
        }

        @Test
        @DisplayName("Weight Getter and Setter")
        void testWeightGetterSetter() {
            person.setWeight(70);
            assertEquals(70, person.getWeight(), "Weight should be updated to 70");
        }
    }

    @Nested
    @DisplayName("FormattedName and FormattedAddress Tests")
    class FormattedTests {
    	@Test
    	@DisplayName("Formatted Name")
    	void testFormattedName() {
    	    Name name = new Name("John Doe");
    	    person.setName(name);
    	    assertEquals("John Doe", person.formattedName(), "Formatted name should match the set name");
    	}


        @Test
        @DisplayName("Formatted Address")
        void testFormattedAddress() {
            person.setAddress("Country", "Street", "Number", "City", "PostalCode");
            assertEquals("Street,Number,City,Country,PostalCode", person.formattedAddress(), "Formatted address should match the set address");
        }
    }

    @Nested
    @DisplayName("BMI Calculation Test")
    class BmiTests {
        @Test
        @DisplayName("BMI Calculation")
        void testBmiCalculation() {
            assertTrue(person.bmi() > 0, "BMI should be a positive value");
        }
    }
}