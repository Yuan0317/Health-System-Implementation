/*
 * file name:Address.java
 * Author:Yuan Tang 041128167
 * course:CST8284 
 * assignment:1
 * date:2/28/2024
 * professor:Reg
 * class list:311
 */


package level2Assignment1;


/**
 * Represents a physical address, including details such as street, number, city, country, and postal code.
 * This class is designed to encapsulate all necessary information for an address and provide methods to access
 * and modify these details.
 */
public class Address {
	/*	Attributes			************************************/
 private String street;
 private String number;
 private String city;
 private String country;
 private String postalCode;
 

	
	
 /**
  * Constructs a new Address with the specified country, street, number, city, and postal code.
  * 
  * @param country The country of the address.
  * @param street The street of the address.
  * @param number The house or apartment number of the address.
  * @param city The city of the address.
  * @param postalCode The postal code of the address.
  */
 public Address(String country,String street,String number,String city,String postalCode){
	 this.country=country;
	 this.city=city;
	 this.street=street;
	 this.number=number;
	 this.postalCode=postalCode;
 }

 /**
  * Returns a string representation of the Address, including all its components.
  * 
  * @return A string representation of the Address.
  */
@Override
public String toString() {
	return "Address [street=" + street + ", number=" + number + ", city=" + city + ", country=" + country
			+ ", postalCode=" + postalCode + "]";
}

/**
 * Returns a formatted address string, combining all address components separated by commas.
 * 
 * @return A formatted address string.
 */
public String formattedAddress(){
	return String.format("%s,%s,%s,%s,%s",street,number,city,country,postalCode);
}

//getter and setter
/**
 * Returns the street of the address.
 * 
 * @return The street.
 */
public String getStreet() {
	return street;
}

/**
 * Sets the street of the address.
 * 
 * @param street The new street.
 */
public void setStreet(String street) {
	this.street = street;
}

/**
 * Returns the number of the address.
 * 
 * @return The number.
 */
public String getNumber() {
	return number;
}

/**
 * Sets the number of the address.
 * 
 * @param number The new number.
 */
public void setNumber(String number) {
	this.number = number;
}

/**
 * Returns the city of the address.
 * 
 * @return The city.
 */
public String getCity() {
	return city;
}

/**
 * Sets the city of the address.
 * 
 * @param city The new city.
 */
public void setCity(String city) {
	this.city = city;
}

/**
 * Returns the country of the address.
 * 
 * @return The country.
 */
public String getCountry() {
	return country;
}

/**
 * Sets the country of the address.
 * 
 * @param country The new country.
 */
public void setCountry(String country) {
	this.country = country;
}

/**
 * Returns the postal code of the address.
 * 
 * @return The postal code.
 */
public String getPostalCode() {
	return postalCode;
}

/**
 * Sets the postal code of the address.
 * 
 * @param postalCode The new postal code.
 */
public void setPostalCode(String postalCode) {
	this.postalCode = postalCode;
}

	


}
