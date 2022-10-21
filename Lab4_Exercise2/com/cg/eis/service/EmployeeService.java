package Lab4_Exercise2.com.cg.eis.service;

import Lab4_Exercise2.com.cg.eis.pl.Employee;

public interface EmployeeService {
	Employee getDetails();
	String findInsuranceScheme(double salary, String designation);
	void displayEmployeeDetails(Employee emp);

}
