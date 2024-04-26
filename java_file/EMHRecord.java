
/*
 * file name:EMHRecord.java
 * Author:Yuan Tang 041128167
 * course:CST8284 
 * assignment:1
 * date:2/28/2024
 * professor:Reg
 * class list:311
 */

package level2Assignment1;


/**
 * Represents an Electronic Medical Health Record for a patient.
 * @author tang yuan
 */

public class EMHRecord {

private String reportingFacilityProvince;
private String institutionNumber;
private String  funcitonalCentreAccount;
private int encounterSequence;
private String healthCareNumber;
private String chartNumber;
private String issuingProvince;
private String residenceCode;
private String gender;//{M,F,U,O}
private int submissionYear;
private String adminViaAmbulance;
private int registrationDate;//{yyyymmdd}
private int registrationTime;//{hhmm}

/**
 * EMHrecord constructor
 * @param the reportingFacilityProvince
 * @param  the institutionNumber
 * @param  the chartNumber
 * @param  the healthCareNumber
 */
public EMHRecord(String reportingFacilityProvince,String institutionNumber,String chartNumber,String healthCareNumber) {
	 this.reportingFacilityProvince=reportingFacilityProvince;
	 this.institutionNumber=institutionNumber;
	 this.chartNumber=chartNumber;
	 this.healthCareNumber=healthCareNumber;
	}


//setter and getter
/**
 * gets the funcitonalCentreAccount
 * @return a string specify funcitonalCentreAccount
 */
public String getFuncitonalCentreAccount() {
	return funcitonalCentreAccount;
}
/**
 * sets the FuncitonalCentreAccount
 * @param funcitonalCentreAccount
 */
public void setFuncitonalCentreAccount(String funcitonalCentreAccount) {
	this.funcitonalCentreAccount = funcitonalCentreAccount;
}

/**
 * gets the EncounterSequence
 * @return EncounterSequence
 */
public int getEncounterSequence() {
	return encounterSequence;
}

/**
 * sets the EncounterSequence
 * @param encounterSequence
 */
public void setEncounterSequence(int encounterSequence) {
	this.encounterSequence = encounterSequence;
}

/**
 * gets IssuingProvince
 * @return IssuingProvince
 */
public String getIssuingProvince() {
	return issuingProvince;
}
/**
 * sets IssuingProvince
 * @param issuingProvince
 */
public void setIssuingProvince(String issuingProvince) {
	this.issuingProvince = issuingProvince;
}

/**
 * gets ResidenceCode
 * @return ResidenceCode
 */
public String getResidenceCode() {
	return residenceCode;
}
/**
 * sets ResidenceCode
 * @param residenceCode
 */
public void setResidenceCode(String residenceCode) {
	this.residenceCode = residenceCode;
}
/**
 * gets gender
 * @return gender
 */
public String getGender() {
	return gender;
}
/**
 * sets gender
 * @param gender
 */
   public void setGender(String gender) {
    if (!gender.matches("[MFUO]")) {
        throw new IllegalArgumentException("Invalid gender: " + gender);
    }
    this.gender = gender;
}
/**
 * gets submissionYear
 * @return
 */
public int getSubmissionYear() {
	return submissionYear;
}
/**
 * sets submissionYear
 * @param submissionYear
 */
public void setSubmissionYear(int submissionYear) {
	this.submissionYear = submissionYear;
}
/**
 * gets AdminViaAmbulance
 * @return
 */
public String getAdminViaAmbulance() {
	return adminViaAmbulance;
}
/**
 * sets AdminViaAmbulance
 * @param adminViaAmbulance
 */

public void setAdminViaAmbulance(String adminViaAmbulance) {
	this.adminViaAmbulance = adminViaAmbulance;
}
/**
 * gets RegistrationDate
 * @return
 */
public int getRegistrationDate() {
	return registrationDate;
}
/**
 * sets RegistrationDate
 * @param registrationDate
 */
public void setRegistrationDate(int registrationDate) {
	this.registrationDate = registrationDate;
}
/**
 * gets RegistrationTime
 * @return a integer
 */
public int getRegistrationTime() {
	return registrationTime;
}
/**
 * sets RegistrationTime
 * @param registrationTime
 */
public void setRegistrationTime(int registrationTime) {
	this.registrationTime = registrationTime;
}
/**
 * gets ReportingFacilityProvince
 * @return a string 
 */
public String getReportingFacilityProvince() {
	return reportingFacilityProvince;
}

/**
 * set ReportingFacilityProvince
 * @param reportingFacilityProvince
 */
public void setReportingFacilityProvince(String reportingFacilityProvince) {
	this.reportingFacilityProvince = reportingFacilityProvince;
}

/**
 * gets InstitutionNumber
 * @return a string 
 */
public String getInstitutionNumber() {
	return institutionNumber;
}

/**
 * sets InstitutionNumber
 * @param institutionNumber
 */
public void setInstitutionNumber(String institutionNumber) {
	this.institutionNumber = institutionNumber;
}

/**
 * gets HealthCareNumber
 * @return a string 
 */
public String getHealthCareNumber() {
	return healthCareNumber;
}

/**
 * sets HealthCareNumber
 * @param healthCareNumber
 */
public void setHealthCareNumber(String healthCareNumber) {
	this.healthCareNumber = healthCareNumber;
}

/**
 * gets the ChartNumber
 * @return a string 
 */
public String getChartNumber() {
	return chartNumber;
}

/**
 * sets ChartNumber
 * @param chartNumber
 */
public void setChartNumber(String chartNumber) {
	this.chartNumber = chartNumber;
}

/**
 * convert to String 
 * @return a string representation of all the values 
 */
@Override
public String toString() {
	return "EMHRecord [reportingFacilityProvince=" + reportingFacilityProvince + ", institutionNumber="
			+ institutionNumber + ", funcitonalCentreAccount=" + funcitonalCentreAccount + ", encounterSequence="
			+ encounterSequence + ", healthCareNumber=" + healthCareNumber + ", chartNumber=" + chartNumber
			+ ", issuingProvince=" + issuingProvince + ", residenceCode=" + residenceCode + ", gender=" + gender
			+ ", submissionYear=" + submissionYear + ", adminViaAmbulance=" + adminViaAmbulance + ", registrationDate="
			+ registrationDate + ", registrationTime=" + registrationTime + "]";
}









	

	
	
	
}
