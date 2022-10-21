package Lab5;

import java.util.Scanner;

public class Exercise2 {
	static Employee emp;
	public static void main(String[] args) throws UserDefinedException{
		Exercise2 ed = new Exercise2();
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter First Name");
//		
//		System.out.println("Enter Last Name");
		emp.setFirstName("");
		emp.setLastName("Ram");
		
		try {
			if(emp.getFirstName().isEmpty() && emp.getLastName().isEmpty()) {
				throw new UserDefinedException("Both are blank");
			}
			else if (emp.getFirstName().isEmpty() || emp.getLastName().isEmpty()) {
				
			}
			else {
				System.out.println("Employee name is: "+emp.getFirstName()+" "+emp.getLastName());
			}
			
			
		} catch (UserDefinedException e) {
			e.printStackTrace();
			
		}

	}

}
