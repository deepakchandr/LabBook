package Lab1;

//Exercise 6: Create a class with a method to find the difference between the sum of the squares and the square of the sum of the first n natural numbers

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		int sqrOfSum = squareOfSum(n);
		int sumOfSqr = sumOfSquare(n);
		//find the difference
		System.out.println(sumOfSqr-sqrOfSum);

	}
	static int squareOfSum(int n) {
		int sum = 0;
		for(int i = 0;i<=n; i++) {
			sum+=i;
		}
		return sum*sum;
	}
	static int sumOfSquare(int n) {
		int sum = 0;
		for(int i=0;i<=n;i++) {
			sum+=(i*i);
		}
		return sum;
	}

}
