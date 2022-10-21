package Lab1;

import java.util.Iterator;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		nonRecursive(n);
		//Using Recursion
		System.out.println("nth value using recrusion is: "+recursive(n));
		

	}
	static void nonRecursive(int n) {
		int n1 = 1;
		int n2 = 1;
		int nth =n2;
		for (int i =2; i<n;i++) {
			nth = n1+n2;
			n1= n2;
			n2= nth;
		}
		System.out.println("nth value using non recursion is: "+nth);
	}
	static int recursive(int n) {
		if (n<=2) {
			return 1;
		}
		return recursive(n-2)+recursive(n-1);
	}

}
