
/*
 * file name:Address_Test.java
 * Author:Yuan Tang 041128167
 * course:CST8284 
 * assignment:1
 * date:2/28/2024
 * professor:Reg
 * class list:311
 */

package level2Assignment1;



/*		@(#)Address_Test.java	Feb. 15, 2024
*
*/


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
* Test class for testing the Address class
* Uses JUnit version 5
* @author yuan tang 
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - Address")
@TestMethodOrder(OrderAnnotation.class)
public class Address_Test {
	
	private Address address;

	@BeforeEach
	/**
	 * 
	 * @throws Exception
	 */
	void setUp() throws Exception {
		 address = new Address("Country", "Street", "Number", "City", "PostalCode");
		 System.out.println("Start a new test case:");
	}

	@AfterEach
	void tearDown() throws Exception {
		address=null;
		System.out.println("Tear down a test case:");
	}
		

	/*		Methods to test
	 * 
	 * 	+Address(...)
			+formattedAddress():String
			+street():String
			+postalCode():String
			+getCity():String
			+setStreet(street:String):void
			+setNumber(number:String):void
			+setCity(city:String):void
			+setCountry(country:String):void
			+setPostalCode(postalCode:String):void
	 */
	
	@Nested	@DisplayName("Address() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class AddressTest {
		@Test @Order(1) @DisplayName("Address() test with Null arguments")
		final void testAddressWithNullArguments() {
			Address address = new Address(null, null, null, null, null);
			assertAll("All fields should be null",
			        () -> assertNull(address.getCountry(), "Country should be null"),
			        () -> assertNull(address.getStreet(), "Street should be null"),
			        () -> assertNull(address.getNumber(), "Number should be null"),
			        () -> assertNull(address.getCity(), "City should be null"),
			        () -> assertNull(address.getPostalCode(), "PostalCode should be null")
			    );
		}
		

	}

	@Nested	@DisplayName("toString() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class ToStringTest {
		@Test @Order(1) @DisplayName("toString()")
		final void testToString() {
			String expected = "Address [street=Street, number=Number, city=City, country=Country, postalCode=PostalCode]";
	        assertEquals(expected, address.toString());
		}
	}
	
	@Nested	@DisplayName("formattedAddress() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class FormattedAddress {
		@Test @Order(1) @DisplayName("formattedAddress()")
		final void testFormattedAddress() {
			String expected = "Street,Number,City,Country,PostalCode";
	        assertEquals(expected, address.formattedAddress());
	    
		}
	
	}

	@Nested	@DisplayName("postalCode() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class PostalCodeTest {
		@Test @Order(1) @DisplayName("postalCode()")
		final void testPostalCode() {
			assertEquals("PostalCode", address.getPostalCode());
		}	
	}

	@Nested	@DisplayName("getCity() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetCityTest {
		@Test @Order(1) @DisplayName("getCity()")
		final void testGetCity() {
			assertEquals("City", address.getCity());
		}	
	}

	
	@Nested	@DisplayName("setStreet() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetStreetTest {
		@Test @Order(1) @DisplayName("setStreet()")
		final void testSetStreet() {
			String newStreet = "NewStreet";
	        address.setStreet(newStreet);
	        assertEquals(newStreet, address.getStreet());
		}
	}
	
	@Nested	@DisplayName("setNumber() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetNumberTest {
		@Test @Order(1) @DisplayName("setNumber()")
		final void testSetNumber() {
			String newNumber="newNumber";
			address.setNumber(newNumber);
			assertEquals(newNumber,address.getNumber());
		}
	}


	@Nested	@DisplayName("setCity() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetCityTest {
		@Test @Order(1) @DisplayName("setCity()")
		final void testSetCity() {
		    String newCity = "NewCity";
	        address.setCity(newCity);
	        assertEquals(newCity, address.getCity());
		}
	}
	
	@Nested	@DisplayName("setCountry() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetCountryTest {
		@Test @Order(1) @DisplayName("setCountry()")
		final void testSetCountry() {
			String newCountry = "NewCountry";
	        address.setCountry(newCountry);
	        assertEquals(newCountry, address.getCountry());
		}
	}
	
	@Nested	@DisplayName("setPostalCode() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetPostalCodeTest {
		@Test @Order(1) @DisplayName("setPostalCode()")
		final void testSetCountry() {
			String newPostalCode = "NewPostalCode";
	        address.setPostalCode(newPostalCode);
	        assertEquals(newPostalCode, address.getPostalCode());
		}
	}




}
