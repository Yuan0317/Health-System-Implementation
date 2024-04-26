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

/**
 * Represents a person's name, including first, middle, last names, and an optional salutation.
 * This class provides functionality to manage and format a person's name for display.
 */
public class Name {
	
	/*	Attributes			************************************/
	   private String first = "";
	    private String last = "";
	    private String middle = "";
	    private String salutation = "";
	
	
	    /**
	     * Constructs a new Name instance parsing a single string containing the full name.
	     * The name can be provided in "last,first" format or "first last" format.
	     * 
	     * @param name the full name in either "last,first" or "first last" format.
	     */
	public Name(String name) {
		if(name.contains(",")) {
			//"last,first"
			String[] nameparts=name.split(",");
		   if(nameparts.length ==2) {
			   this.last= nameparts[0].trim();//set last name
			   this.first=nameparts[1].trim();//set first name
		   }else {
			   System.out.println("The name format is invalid . It should be'first last'or 'last first'.");
		   }
		}else {
			//first last
			String[] nameparts = name.split(" ");
			 if(nameparts.length ==2) {
				   this.last= nameparts[1];//set last name
				   this.first=nameparts[0];//set first name
		}else {
			System.out.println("The name format is invalid . It should be'first last'or 'last first'.");
		}
	}
	}
	
	/*	Constructors		************************************/
	 /**
     * Default constructor for creating a Name instance without any name information.
     */
	public Name() {

	}

	/**
     * Constructs a new Name instance with specified first and last names.
     * 
     * @param first the first name of the person.
     * @param last the last name of the person.
     */
	public Name(String first,String last) {
		this(first,"",last);
		
	}
	
    /**
     * Constructs a new Name instance with specified first, middle, and last names.
     * 
     * @param first the first name of the person.
     * @param middle the middle name of the person.
     * @param last the last name of the person.
     */
	public Name(String first,String middle,String last) {
		this.first=first;
		this.middle=middle;
		this.last=last;
		
	}
	
	
	  /**
     * Returns a string representation of the Name instance, including first, middle, last names, and salutation.
     * 
     * @return a string representation of the Name instance.
     */
	@Override
	public String toString() {
		return "Name [first=" + first + ", last=" + last + ", middle=" + middle + ", salutation=" + salutation
				+ "]";
	}
	
	   /**
     * Returns the full name formatted with the salutation, first, middle, and last names.
     * 
     * @return the formatted full name as a String.
     */
	public String formattedName() {
		String fullName = (salutation.isEmpty() ? "" : salutation + " ") + first + (middle.isEmpty() ? " " : " " + middle + " ") + last;
        return fullName.trim();
	}
	


	//getter and setter
    /**
     * Returns the first name.
     * 
     * @return the first name as a String.
     */
	public String getFirst() {
		return first;
	}
	
    /**
     * Sets the first name.
     * 
     * @param first the first name to set.
     */
	public void setFirst(String first) {
		this.first = first;
	}
	
	   /**
     * Returns the last name.
     * 
     * @return the last name as a String.
     */
	public String getLast() {
		return last;
	}
	
    /**
     * Sets the last name.
     * 
     * @param last the last name to set.
     */
	public void setLast(String last) {
		this.last = last;
	}
	
	   /**
     * Returns the middle name.
     * 
     * @return the middle name as a String.
     */
	public String getMiddle() {
		return middle;
	}
	
    /**
     * Sets the middle name.
     * 
     * @param middle the middle name to set.
     * */
	public void setMiddle(String middle) {
		this.middle = middle;
	}
	
    /**
     * Returns the salutation or title of the person.
     * 
     * @return the salutation as a String.
     */
	public String getSalutation() {
		return salutation;
	}
	
    /**
     * Sets the salutation or title of the person.
     * 
     * @param salutation the salutation to set.
     */
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	
	


}



