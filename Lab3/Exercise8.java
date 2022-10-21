package Lab3;

import java.util.Scanner;

//Exercise 8: Create a method that accepts a String and checks if it is a positive string. A string is considered a positive string, if on moving from left to right each character in the String comes after the previous characters in the Alphabetical order. For Example: ANT is a positive String (Since T comes after N and N comes after A). The method should return true if the entered string is positive.

public class Exercise8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		System.out.println(checkString(string));

	}
	static boolean checkString(String str) {
		char[] ch =str.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			if (ch[i]>ch[i+1]) {  //condition to check character at position i > i+1
				return false;
			}
		}
		return true;
	}

}
