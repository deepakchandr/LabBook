package Lab4_Exercise2.com.cg.eis.bean;

import java.util.List;
import java.util.Scanner;

import Lab4_Exercise2.com.cg.eis.pl.Employee;
import Lab4_Exercise2.com.cg.eis.service.EmployeeService;
import Lab4_Exercise2.com.cg.eis.service.ServicesToEmployee;

public class Exercise2 {

	public static void main(String[] args) {
		int input = 0;
		int loop = 0;
		
		ServicesToEmployee es = new ServicesToEmployee();
		Employee emp = es.getDetails();
		while (loop != 4) {

			System.out.println("List of sevices offerd\n" + "Press 1 to enter employe details\n"
					+ "Press 2 to Check insurance scheme\n" + "Press 3 to display employee details\n"
					+ "Press 4 to exit");
			Scanner sc = new Scanner(System.in);
			input = sc.nextInt();
			switch (input) {
			case 1:
				es.getDetails();
				break;
			case 2:
				System.out.println("Enter salary");
				double salary = sc.nextDouble();
				System.out.println("Enter Designation");
				String designation = sc.next();
				System.out.println("Insurance Scheme: " + es.findInsuranceScheme(salary, designation));
				break;

			case 3:
				es.displayEmployeeDetails(emp);
			
			case 4:
				loop = input;
				System.out.println("Exit");
				break;

			default:
				System.out.println("Wrong input try again");
				break;
			}
		}

	}

}
