package Lab1;

//Exercise 5: Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5.

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int sum = 0;
		while(n>0) {
			if (div(n)==true) {
				sum = sum + n;
			}
			n--;
		}
		System.out.println("Sum of number: "+sum);

	}
	static boolean div(int n) {
		if (n%3==0 || n%5==0) {    //condition to check no divisible by 3 or 5
			return true;
		}
		return false;
	}

}
