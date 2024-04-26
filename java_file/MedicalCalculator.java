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

/**
 * Class to apply calculations to specific type of EMR's and data.
 * Currerntly supports BMI (Body Mass Index) calculations.
 */
public class MedicalCalculator {
	public MedicalCalculator()	{
	}

	/**
	 * This method returns the calculated Body Mass Index (BMI) from data provided.
	 * @param weight of the patient in pounds.
	 * @param height of the patient in inches.
	 */
	public static double calculateBMI(double weight, double height) {
		return weight * 703 / (height * height);
	}
	// incorrect math example，because the dividend should not be 0
	/**
	 * 
	 * @param weight
	 * @param height
	 * @return for test the wrong math 
	 */
	public double incorrectBMI(double weight,double height) {
		return weight * height/ 0;
	}

	/**
	 * Main entry point for quick and dirty test purposes.
	 * @param args Command line arguments submitted thru the VM
	 */
	public static void main(String[] args) {
		System.out.println("BMI:" + calculateBMI(165, 69));

		System.out.println("\nBMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");

	}
}
