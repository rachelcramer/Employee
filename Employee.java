
public class Employee {

	public String firstName;
	private String lastName;
	private double monthlySalary;
	
	//constructor
	public Employee(String firstName, String lastName, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		if (monthlySalary >= 0.0) {
			//this determines whether the salary is positive
			this.monthlySalary = monthlySalary;
		}
	}
//this SETS employee's first name
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
//this GETS employee's first name
	public String getFirstName() {
		return firstName;
	}
//this SETS employee's last name
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
//this GETS employee's last name
	public String getLastName(){
	return lastName;	
	}
//this SETS employee's monthly salary
	public void setMonthlySalary(double monthlySalary) {
		if (monthlySalary >= 0.0) {
		//this determines whether the salary is positive
			this.monthlySalary = monthlySalary;
		}
	}
	
//this GETS employee's monthly salary
	public double getMonthlySalary() {
		return monthlySalary;
	}
}//end
