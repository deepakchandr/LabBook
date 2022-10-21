package Lab1;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		if (checkNumber(n)) {
			System.out.println("no is power of 2");
		}
		else {
			System.out.println("no is not power of 2");
		}

	}
	static boolean checkNumber(int n) {
		while (n%2==0 && n!=0) {
			n/=2;
			
		}
		System.out.println(n);
		if (n==1) {
			return true;
		}
		return false;
	}

}
