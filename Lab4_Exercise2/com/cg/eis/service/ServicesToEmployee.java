package Lab4_Exercise2.com.cg.eis.service;

import java.util.Scanner;

import Lab4_Exercise2.com.cg.eis.pl.Employee;

public class ServicesToEmployee implements EmployeeService {

	@Override
	public Employee getDetails() {
		System.out.println("Please enter employee details:");
		Employee employee = new Employee();
		Scanner scanner = new Scanner(System.in);
		//Employee Id
		System.out.println("Enter Employee Id:");
		employee.setEmpId(scanner.nextInt());
		//Employee name input
		System.out.println("Enter Employee name");
		employee.setEmpName(scanner.next());
		//Employee Salary input
		System.out.println("Enter salary");
		employee.setEmpSalary(scanner.nextDouble());
		//Employee Designation
		System.out.println("Enter Employee Designation");
		employee.setEmpDesignation(scanner.next());
		return null;
	}

	@Override
	public String findInsuranceScheme(double salary, String designation) {
		String scheme;
		if (salary>=1200000 && designation.equals("A")) {
			scheme = "Scheme A";
		}
		else if (salary>=800000 && designation.equals("B")) {
			scheme= "Scheme B";
		}
		else if (salary>=500000 && designation.equals("C")) {
			scheme= "Scheme B";
		}
		else {
			scheme = "Default scheme";
		}
		return scheme;
	}

	@Override
	public void displayEmployeeDetails(Employee emp) {
		System.out.println(emp.toString());	
	}
	
}
