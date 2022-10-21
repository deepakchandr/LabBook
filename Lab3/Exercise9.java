package Lab3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Exercise 9: Create a method to accept date and print the duration in days, months and years with regards to current system date.

public class Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the date in DD.MM.YYYY fromat");
		Scanner sc = new Scanner(System.in);
		Pattern p = Pattern.compile("(//d{0,3})(//d{0,9})//.(//d{0,1})(//d{0,9})//.//d//d//d//d");
		
		boolean flag = true;
		while(flag) {
			String str = sc.nextLine();
			Matcher m = p.matcher(str);
			if (m.matches()) {
				flag = false;
				
			}
			else {
				System.out.println("Wrong date format Enter again");
			}
			
			
		}

	}

}
