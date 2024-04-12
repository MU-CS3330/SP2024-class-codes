package edu.mu.solid.srp.bad;

//Bad example: Mixing responsibilities
public class Employee {
	public void saveEmployee(Employee employee) {
		// Save employee to database
	}

	public void calculateSalary(Employee employee) {
		// Calculate salary
	}
}
