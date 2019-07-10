public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Michael", "David", 2875.00);
		Employee employee2 = new Employee("Susan", "James", 3150.75);
		Employee employee3 = new Employee("Mike", "Anthony", 6800.85);
		Employee employee4 = new Employee("Susan", "Baker", 4150.95);
		Employee employee5 = new Employee("Joe", "Chris", 7150.45);
		Employee employee6 = new Employee("Rachel", "Salvaggio", 5896.15);
		Employee employee7 = new Employee("Phillip", "Bevacqua", 4631.28);
		Employee employee8 = new Employee("Jeanne", "Pulling", 4862.15);
		Employee employee9 = new Employee("Guillermina", "Alenc", 9853.68);
		Employee employee10 = new Employee("Michael", "LaGuardia", 3418.92);
		
		//this displays employees
		System.out.printf("Employee 1: %s %s; Yearly Salary: %.2f%n", employee1.getFirstName(), employee1.getLastName(), 12 * employee1.getMonthlySalary());
		System.out.printf("Employee 2: %s %s; Yearly Salary: %.2f%n", employee2.getFirstName(), employee2.getLastName(), 12 * employee2.getMonthlySalary());
		System.out.printf("Employee 3: %s %s; Yearly Salary: %.2f%n", employee3.getFirstName(), employee3.getLastName(), 12 * employee3.getMonthlySalary());
		System.out.printf("Employee 4: %s %s; Yearly Salary: %.2f%n", employee4.getFirstName(), employee4.getLastName(), 12 * employee4.getMonthlySalary());
		System.out.printf("Employee 5: %s %s; Yearly Salary: %.2f%n", employee5.getFirstName(), employee5.getLastName(), 12 * employee5.getMonthlySalary());
		System.out.printf("Employee 6: %s %s; Yearly Salary: %.2f%n", employee6.getFirstName(), employee6.getLastName(), 12 * employee6.getMonthlySalary());
		System.out.printf("Employee 7: %s %s; Yearly Salary: %.2f%n", employee7.getFirstName(), employee7.getLastName(), 12 * employee7.getMonthlySalary());
		System.out.printf("Employee 8: %s %s; Yearly Salary: %.2f%n", employee8.getFirstName(), employee8.getLastName(), 12 * employee8.getMonthlySalary());
		System.out.printf("Employee 9: %s %s; Yearly Salary: %.2f%n", employee9.getFirstName(), employee9.getLastName(), 12 * employee9.getMonthlySalary());
		System.out.printf("Employee 10: %s %s; Yearly Salary: %.2f%n", employee10.getFirstName(), employee10.getLastName(), 12 * employee10.getMonthlySalary());
		
		//this raises employees salaries by 10%
		System.out.printf("%nIncreasing employee salaries by 10%%%n");
		employee1.setMonthlySalary(employee1.getMonthlySalary() * 1.10);
		employee2.setMonthlySalary(employee2.getMonthlySalary() * 1.10);
		employee3.setMonthlySalary(employee3.getMonthlySalary() * 1.10);
		employee4.setMonthlySalary(employee4.getMonthlySalary() * 1.10);
		employee5.setMonthlySalary(employee5.getMonthlySalary() * 1.10);
		employee6.setMonthlySalary(employee6.getMonthlySalary() * 1.10);
		employee7.setMonthlySalary(employee7.getMonthlySalary() * 1.10);
		employee8.setMonthlySalary(employee8.getMonthlySalary() * 1.10);
		employee9.setMonthlySalary(employee9.getMonthlySalary() * 1.10);
		employee10.setMonthlySalary(employee10.getMonthlySalary() * 1.10);
		
		//this displays employees with new salaries
		
		System.out.printf("Employee 1: %s %s; Yearly Salary: %.2f%n", employee1.getFirstName(), employee1.getLastName(), 12 * employee1.getMonthlySalary());
		System.out.printf("Employee 2: %s %s; Yearly Salary: %.2f%n", employee2.getFirstName(), employee2.getLastName(), 12 * employee2.getMonthlySalary());
		System.out.printf("Employee 3: %s %s; Yearly Salary: %.2f%n", employee3.getFirstName(), employee3.getLastName(), 12 * employee3.getMonthlySalary());
		System.out.printf("Employee 4: %s %s; Yearly Salary: %.2f%n", employee4.getFirstName(), employee4.getLastName(), 12 * employee4.getMonthlySalary());
		System.out.printf("Employee 5: %s %s; Yearly Salary: %.2f%n", employee5.getFirstName(), employee5.getLastName(), 12 * employee5.getMonthlySalary());
		System.out.printf("Employee 6: %s %s; Yearly Salary: %.2f%n", employee6.getFirstName(), employee6.getLastName(), 12 * employee6.getMonthlySalary());
		System.out.printf("Employee 7: %s %s; Yearly Salary: %.2f%n", employee7.getFirstName(), employee7.getLastName(), 12 * employee7.getMonthlySalary());
		System.out.printf("Employee 8: %s %s; Yearly Salary: %.2f%n", employee8.getFirstName(), employee8.getLastName(), 12 * employee8.getMonthlySalary());
		System.out.printf("Employee 9: %s %s; Yearly Salary: %.2f%n", employee9.getFirstName(), employee9.getLastName(), 12 * employee9.getMonthlySalary());
		System.out.printf("Employee 10: %s %s; Yearly Salary: %.2f%n", employee10.getFirstName(), employee10.getLastName(), 12 * employee1.getMonthlySalary());
	}

}//end
