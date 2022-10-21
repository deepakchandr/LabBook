package Lab1;

import java.util.Scanner;

//Exercise 1: Create a method to find the sum of the cubes of the digits of an n digit number

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n digit no:");
		int n = sc.nextInt();
		int sum = 0;
		do {
			sum += cube(n%10);//calling cube method
			n/=10;
		} while (n%10!=0);
		System.out.println(sum);
		
	}
	public static int cube(int n) {
		return n*n*n;
	}

}
