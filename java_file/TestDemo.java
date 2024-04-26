package level2Assignment1;


/**
 * This is a simple test demo class for the health care system.
 */
public class TestDemo {

	/**
	 * Main entry point for testing the health care assignment.
	 * @param args	Array of command line arguments input thru the VM
	 */
	public static void main(String[] args) {

			BirthDate bd = new BirthDate(1970,12,01);
			Name name=new Name("tang yuan");
			name.setSalutation("Miss");		
			//only constructor we use 
			EMRecord p1=new EMRecord("Ontoria","110","888","041128167",63,120);
			p1.setName(name);
			p1.setAddress("Canada","Champagne","105","Ottawa","k1s5e5");
			//Subclasses inherit attributes from the parent class
			p1.setFuncitonalCentreAccount("FC123");
			p1.setEncounterSequence(1001);
			p1.setIssuingProvince("ON");
			p1.setResidenceCode("R123");
			p1.setGender("F");
			p1.setSubmissionYear(2024);
			p1.setAdminViaAmbulance("yes");
			p1.setRegistrationDate(20240301);
			p1.setRegistrationTime(1300);
			
			System.out.printf("Patient Name: %s\n", p1.formattedName());
			System.out.printf("%s\n",bd.formattedBirthDate());
			System.out.printf("Address: %s\n", p1.formattedAddress());
			System.out.printf("Province: %s\n", p1.getReportingFacilityProvince());
			System.out.printf("Institution Number: %s\n",p1.getInstitutionNumber());
			System.out.printf("Chart Number: %s\n",p1.getChartNumber());
			System.out.printf("Health Care Number: %s\n",p1.getHealthCareNumber());
			System.out.printf("funcitonalCentreAccount: %s\n",p1.getFuncitonalCentreAccount());
			System.out.printf("encounterSequence: %d\n",p1.getEncounterSequence());
			System.out.printf("issuingProvince: %s\n",p1.getIssuingProvince());
			System.out.printf("residenceCode: %s\n",p1.getResidenceCode());
			System.out.printf("gender: %s\n",p1.getGender());
			System.out.printf("submissionYear: %d\n",p1.getSubmissionYear());
			System.out.printf("adminViaAmbulance: %s\n",p1.getAdminViaAmbulance());
			System.out.printf("registrationDate: %d\n",p1.getRegistrationDate());
			System.out.printf("registrationTime: %d\n",p1.getRegistrationTime());			
			System.out.printf("BMI: %d\n", p1.bmi());

		
		/*	You do not need to modify this piece of code, it is fine as it is.			*/
		System.out.println("\nBMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");

	}

}
