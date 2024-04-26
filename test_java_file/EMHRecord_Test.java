
/*
 * file name:EMHRecord_Test.java
 * Author:Yuan Tang 041128167
 * course:CST8284 
 * assignment:1
 * date:2/28/2024
 * professor:Reg
 * class list:311
 */
package level2Assignment1;


import org.junit.jupiter.api.Test;

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
* Test class for testing the EMHRecord class
* Uses JUnit version 5
* @author Yuan Tang
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - EMHRecord")
@TestMethodOrder(OrderAnnotation.class)
public class EMHRecord_Test {
        private EMHRecord record;
        
	@BeforeEach
	void setUp() throws Exception {
		 record = new EMHRecord("Ontario", "12345", "67890", "AB123456");
	}

	@AfterEach
	void tearDown() throws Exception {
		  record = null;
	}

	/*		Methods to test
	 * 
		+EMHRecord(reportingFacilityProvince:String, institutionNumber:String, chartNumber:String,healthCareNumber:String)
		+toString():String
	 */

   @DisplayName("Constructor Tests")
   @TestMethodOrder(OrderAnnotation.class)
    class ConstructorTests {
    @Test
    void testEMHRecordWithValidArguments() {
        assertNotNull(record, "Record should not be null with valid constructor arguments");
    }
	}

	@Nested
    @DisplayName("toString() Test")
    class ToStringTest {
        @Test
        @DisplayName("toString()")
        void testToString() {
            String expectedString = "EMHRecord [reportingFacilityProvince=Ontario, institutionNumber=12345, funcitonalCentreAccount=null, encounterSequence=0, healthCareNumber=AB123456, chartNumber=67890, issuingProvince=null, residenceCode=null, gender=null, submissionYear=0, adminViaAmbulance=null, registrationDate=0, registrationTime=0]";
            assertEquals(expectedString, record.toString(), "toString() should return the correct string representation of EMHRecord");
        }
    }

    @Nested
    @DisplayName("Getter and Setter Tests")
    class GetterAndSetterTests {
        @Test
        @DisplayName("getReportingFacilityProvince() and setReportingFacilityProvince()")
        void testGetAndSetReportingFacilityProvince() {
            String newProvince = "Quebec";
            record.setReportingFacilityProvince(newProvince);
            assertEquals(newProvince, record.getReportingFacilityProvince(), "Getter and setter for reporting facility province should work correctly");
        }

        @Test
        @DisplayName("setGender() with invalid argument")
        void testSetGenderWithInvalidArgument() {
            Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                record.setGender("X");
            }, "setGender() with invalid argument should throw an exception");
            assertTrue(exception.getMessage().contains("Invalid gender"), "Exception message should indicate invalid gender");
        }
    }

}