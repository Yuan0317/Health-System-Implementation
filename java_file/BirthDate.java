
/*
 * file name:BirthDate.java
 * Author:Yuan Tang 041128167
 * course:CST8284 
 * assignment:1
 * date:2/28/2024
 * professor:Reg
 * class list:311
 */

package level2Assignment1;



/**
 * This class represents the birth date for a patient.  A birth date, once created
 * cannot be changed.
 * 
 */
public class BirthDate {
	/*	Attributes			************************************/
	/** Birth day															*/
	private	final	int	day;
	/** Birth month.														*/
	private	final	int	month;
	/** Birth year.														*/
	private	final	int	year;	
	
	/*	Constructors		************************************/
	/**
	 * Create the birth date for this patient.
	 * @param year		Year of birth (4 numeric characters)
	 * @param month	Month of birth (01 thru 12) (2 digit month)
	 * @param day	Day of birth. (2 digit day, 01 thru 30... depending upon the month and year)
	 */
	public	BirthDate(int year, int month, int day)	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
	/**
	 * Returns the day of the month represented by this date.
	 * 
	 * @return The day of the month (1-31).
	 */
	public int	getDay()		{	return day;			}
	/**
	 * Returns the month of the year represented by this date.
	 * 
	 * @return The month of the year 
	 */
	public int	getMonth()	{	return month;		}
	/**
	 * Returns the year represented by this date.
	 * 
	 * @return The year.
	 */
	public int	getYear()	{	return year;		}

	public String formattedBirthDate()	{
		return String.format("The birthdate is %04d/%02d/%02d", year,month,day);
				}

	/**
	 * Convert this objectd into a meaningful string.
	 * @return	This object as a string.
	 */
	public String toString()	{
		return getClass().getName() + "[year=" + year + ", month=" + month + ", day=" + day + "]"; 
	}


}
