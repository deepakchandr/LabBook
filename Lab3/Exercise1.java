package Lab3;

import java.util.Scanner;

//Exercise 1: Write a Java program that reads a line of integers and then displays each integer and the sum of all integers. (Use String Tokenizer class)?

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char chararr[] = str.toCharArray();// convert string input to array
		for (char c : chararr) {
			System.out.print(c+" ");
		}
		System.out.println();
		int sum = 0;
		for (char c : chararr) {
			sum+=Character.getNumericValue(c);
		}
		System.out.println("Sum ="+sum);
		
	}

}
