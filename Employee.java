import java.util.Random;

public class Employee {

	private String firstName;
	private String lastName;
	private String idNumber;
	private String SocialSecurity;
	private int startYear;
	private String department;
	private String depCode;
	
	/**
	 * Constructor Employee sets initial values
	 * 
	 */
	public Employee() {
		this.firstName = "Adrian";
		this.lastName = "Doe";
		this.startYear = 2017;
		createIdNumber();
	}
	
	
	/**
	 * OverLoaded Constructor Employee.
	 * @param fName first name of employee.
	 * @param lName last name of employee.
	 * @param ssn Social Security Number of employee.
	 * @param startYr Year the employee starts.
	 * @param dep Department of employee.
	 * @param dCode Department number of employee.
	 */
	public Employee(String fName, String lName, String ssn, 
			int startYr, String dep, String dCode){
		firstName = fName;
		lastName = lName;
		SocialSecurity = ssn;
		this.startYear = startYr;
		department = dep;
		depCode = dCode;
		createIdNumber();
		
	}

	/**
	 * Getters and Setters
	 * @return the first name of employee
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param the first name of employee
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return last name of employee
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param last name of employee
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 *@return Social Security number of employee
	 */
	public String getSocialSecurity() {
		return SocialSecurity;
	}

	/**
	 * @return start year of employee
	 */
	public int getStartYear() {
		return startYear;
	}

	/**
	 * @param the start year of employee
	 */
	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}

	/**
	 * @return the name of department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param the name of department
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return returns the department code
	 */
	public String getDepCode() {
		return depCode;
	}

	/**
	 * @param sets the department code
	 */
	public void setDepCode(String depCode) {
		this.depCode = depCode;
	}


	/**
	 * @return the id of employee
	 */
	public String getIdNumber() {
		return idNumber;
	}
	
	/**
	 * The setSocialSecurity lets the users create
	 * input his/her social security and validates it
	 * @param socialSecurity Social security number of employee
	 * @return isCorrect the validation of social Security number
	 * (true or false) value  XXX-XX-XXXX
 	 */
	public boolean setSocialSecurity(String socialSecurity) {
		boolean isCorrect = true;
		
		if(socialSecurity.length() == 11){
			
			if(socialSecurity.charAt(3) != '-' || socialSecurity.charAt(6) != '-'){
				
				isCorrect = false;
			
			}else{
				
				String first  = socialSecurity.substring(0, 3);
				String second  = socialSecurity.substring(4, 6);
				String third  = socialSecurity.substring(7, 11);
				String total = first + second + third;
				
				for(int i = 0; i < 9; i++){
					if(!(Character.isDigit(total.charAt(i)))){
						isCorrect = false;
					}
				}
			}
		}else{
			
			isCorrect = false;
			}
			
		if(isCorrect){
			
				SocialSecurity = socialSecurity;
			
		}
			return isCorrect;
			
	}
	
	
	/**
	 * Create an ID for employee
	 * in the following format: AA-XXXX
	 */
	private void createIdNumber(){
		
		//AA-6775 Example ID
		Random rand = new Random();
		char firstLetter = firstName.charAt(0);
		char lastLetter = lastName.charAt(0);
		
		
		int randomNumber = rand.nextInt(10000);
		String stringFormat = String.format("-%04d", randomNumber);
		idNumber = "" + firstLetter + lastLetter +  stringFormat;
		
	}
	
	/**
	 * @return the toString methodZ
	 */
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", idNumber=" + idNumber
				+ ", SocialSecurity=" + SocialSecurity + ", startYear=" + startYear + ", department=" + department
				+ ", depCode=" + depCode + "]";
	}
	
	
	
}
	

