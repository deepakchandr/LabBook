package Lab5;

import java.util.Scanner;
//Exercise 3:  Create an Exception class named as “EmployeeException”(User defined Exception) in a package named as “com.cg.eis.exception” and throw an exception if salary of an employee is below than 3000. Use Exception Handling mechanism to handle exception properly.
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		try {
			
			int salary = scanner.nextInt();
			if (salary<3000) {					//salary less then 3000
				throw new EmployeeException("Salary should be greater then 3000");
			}
		} catch (EmployeeException e) {
			e.printStackTrace();
		}		

	}

}
