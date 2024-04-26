
/*
 * file name:EMRecord.java
 * Author:Yuan Tang 041128167
 * course:CST8284 
 * assignment:1
 * date:2/28/2024
 * professor:Reg
 * class list:311
 */

package level2Assignment1;


/**
 * Represents an electronic medical record (EMR) for a patient, extending the
 * EMHRecord with patient-specific details like height and weight. This class
 * supports basic patient information management and calculation of Body Mass
 * Index (BMI) based on the patient's height and weight.
 */
public class EMRecord extends EMHRecord		{

	/*	Attributes			************************************/
	private int height;
	private int weight;
    private Name name;
    private Address address;

    /**
     * Constructs a new EMRecord with specified details.
     * 
     * @param reportingFacilityProvince The province of the reporting facility.
     * @param institutionNumber The number of the institution.
     * @param chartNumber The chart number for the patient.
     * @param healthCareNumber The health care number of the patient.
     * @param height The height of the patient in centimeters.
     * @param weight The weight of the patient in kilograms.
     */
    public EMRecord(String reportingFacilityProvince,String institutionNumber,String chartNumber,
    		String healthCareNumber,int height,int weight) {
    	super(reportingFacilityProvince,institutionNumber,chartNumber,healthCareNumber);
    	this.height=height;
    	this.weight=weight;   	
    }
	
	
    /**
     * Returns the patient's height.
     * 
     * @return The height in centimeters.
     */
	public int getHeight() {
		return height;
	}

    /**
     * Returns the patient's weight.
     * 
     * @return The weight in kilograms.
     */
	public int getWeight() {
		return weight;
	}
	
    /**
     * Sets the patient's height.
     * 
     * @param height The height in centimeters to set.
     */
	public void setHeight(int height) {
		this.height = height;
	}
	
    /**
     * Sets the patient's weight.
     * 
     * @param weight The weight in kilograms to set.
     */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	

    /**
     * Sets the patient's name.
     * 
     * @param name of the patient.
     */
     public void setName(Name name) {
    	 this.name=name;
     }
 
     /**
      * Sets the patient's address.
      * 
      * @param country The country of the patient's residence.
      * @param street The street of the patient's residence.
      * @param number The house number of the patient's residence.
      * @param city The city of the patient's residence.
      * @param postalCode The postal code of the patient's residence.
      */
     public void setAddress(String country, String street, String number, String city, String postalCode) {
         this.address = new Address(country, street, number, city, postalCode);
     }

     /**
      * Formats and returns the patient's name.
      * 
      * @return A string representing the formatted name of the patient.
      */
     public String formattedName() {
    	 return name.formattedName();
     }
     
     /**
      * Formats and returns the patient's address.
      * 
      * @return A string representing the formatted address of the patient.
      */
     public String formattedAddress() {
    	 return address.formattedAddress();
     }
     
     /**
      * Calculates and returns the Body Mass Index (BMI) of the patient.
      * 
      * @return The BMI as an integer.
      */
     public int bmi() {
    	  double result =MedicalCalculator.calculateBMI(this.weight, this.height);
    	    return (int)result; //forcefully convert to int 
     }

    
}
