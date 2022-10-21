package Lab5;

import java.util.Scanner;

//Exercise 1:  Validate the age of a person and display proper message by using user defined exception. Age of a person should be above 15.


public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		try {
			
			int age = scanner.nextInt();
			if (age<5) {
				throw new InvalidAgeException("Age Should be greater than 5");//error to be printed
			}
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}		

	}

}
