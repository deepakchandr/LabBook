package Lab1;

import java.util.Iterator;
import java.util.Scanner;

//Exercise 4: Write a Java program that prompts the user for an integer and then prints out all the prime numbers up to that Integer?

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a natural number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n>1) {
			if (primeNumber(n)) {
				System.out.print(n+" ");
			}
			n-=1;
		}
		

	}
	static boolean primeNumber(int n) {
		
		for (int i=2; i<n;i++) {
			if (n%i==0) {
				return false;
			}
			
		}
		return true;
	}

}
