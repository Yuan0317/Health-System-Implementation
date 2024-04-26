/*
 * file name:Name.java
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
* Test class for testing the Name class
* Uses JUnit version 5
* @author Yuan Tang
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - Name")
@TestMethodOrder(OrderAnnotation.class)
public class Name_Test {
     Name name;
	@BeforeEach
	void setUp() throws Exception {
	name=new Name();
	}

	@AfterEach
	void tearDown() throws Exception {
		name=null;
	}

	/*		Methods to test
	 * 
			+Name(...)
			+toString():String
			+formattedName():String
			+setFirst(first:String):void
			+setLast(last:String):void
			+setMiddle(middle:String):void
			+setSaluation(salutation:String):void
			+first():String
			+last():String
	 */
	
	@Nested	@DisplayName("Name() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class NameTest {
		@Test @Order(1) @DisplayName("Name() test with Null arguments")
		final void testNameWithNullArguments() {
			Name result = new Name();
			assertAll(
	                () -> assertEquals("", result.getFirst()),
	                () -> assertEquals("", result.getLast()),
	                () -> assertEquals("", result.getMiddle()),
	                () -> assertEquals("", result.getSalutation())
	            );
		}
	}

	@Nested	@DisplayName("toString() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class ToStringTest {
		@Test @Order(1) @DisplayName("toString()")
		final void testToString() {
			name.setFirst("John");
            name.setLast("Doe");
            String expected = "Name [first=John, last=Doe, middle=, salutation=]";
            assertEquals(expected, name.toString());
		}
	}
	
	@Nested	@DisplayName("formattedName() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class FormattedName {
		@Test @Order(1) @DisplayName("formattedName()")
		final void testFormattedName() {
			name.setFirst("John");
            name.setLast("Doe");
            name.setMiddle("Middle");
            name.setSalutation("Mr.");
            String expected = "Mr. John Middle Doe";
            assertEquals(expected, name.formattedName());
		}
		
	}

	@Nested	@DisplayName("setFirst() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetFirstTest {
		@Test @Order(1) @DisplayName("setFirst()")
		final void testSetFirst() {
			name.setFirst("John");
            assertEquals("John", name.getFirst());
		}	
	}
	
	@Nested	@DisplayName("setLast() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetLastTest {
		@Test @Order(1) @DisplayName("setLast()")
		final void testSetLast() {
			 name.setLast("Doe");
	            assertEquals("Doe", name.getLast());
		}	
	}

	@Nested	@DisplayName("setMiddle() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetMiddleTest {
		@Test @Order(1) @DisplayName("setMiddle()")
		final void testMiddle() {
			 name.setMiddle("Middle");
	            assertEquals("Middle", name.getMiddle());
		}	
	}

	
	@Nested	@DisplayName("setSalutation() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetSalutationTest {
		@Test @Order(1) @DisplayName("setSalutation()")
		final void testSetSalutation() {
			 name.setSalutation("Mr.");
	            assertEquals("Mr.", name.getSalutation());
		}
	}
	
	@Nested
	@DisplayName("first() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class FirstTest {
	    @Test
	    @Order(1)
	    @DisplayName("first() when first name is first due to space delimiter")
	    void testFirstWhenSpace() {
	        Name name = new Name("John Doe");
	        assertEquals("John", name.getFirst(), "When input is 'John Doe' (space delimiter), the first name should be 'John'");
	    }

	    @Test
	    @Order(2)
	    @DisplayName("first() when first name is second due to comma delimiter")
	    void testFirstWhenComma() {
	        Name name = new Name("Doe,John");
	        assertEquals("John", name.getFirst(), "When input is 'Doe,John' (comma delimiter), the first name should be interpreted as 'John' even though it appears second");
	    }
	}

	@Nested
	@DisplayName("last() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class LastTest {
	    @Test
	    @Order(1)
	    @DisplayName("last() when last name is second due to space delimiter")
	    void testLastWhenSpace() {
	        Name name = new Name("John Doe");
	        assertEquals("Doe", name.getLast(), "When input is 'John Doe' (space delimiter), the last name should be 'Doe'");
	    }

	    @Test
	    @Order(2)
	    @DisplayName("last() when last name is first due to comma delimiter")
	    void testLastWhenComma() {
	        Name name = new Name("Doe,John");
	        assertEquals("Doe", name.getLast(), "When input is 'Doe,John' (comma delimiter), the last name should be 'Doe' as it appears first");
	    }
	}

	

}