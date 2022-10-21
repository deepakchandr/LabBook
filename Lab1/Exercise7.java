package Lab1;

//Exercise 7: Create a method to check if a number is an increasing number

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=124468;
		if (checkNumber(n)) {
			System.out.println("Increasing number");
		}
		else {
			System.out.println("Not an increasing Number");
		}

	}
	static boolean checkNumber(int n) {
		Integer num = n;
		String s = num.toString();
		for(int i= 0;i<s.length();i++) {
			if (s.charAt(i)>s.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}

}
