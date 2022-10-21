package Lab3;
//Exercise 4: Create a method that accepts a number and modifies it such that the each of the digit in the newly formed number is equal to the difference between two consecutive digits in the original number. The digit in the units place can be left as it is. Note: Take the absolute value of the difference. Ex: 6-8 = 2

import java.util.Iterator;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = modifyNumber(n);
		System.out.println(x);
		

	}
	static int modifyNumber(int n) {
		String string = Integer.toString(n);
		StringBuilder strbld = new StringBuilder();
		char[] ch = string.toCharArray();
		for(int i = 0;i<ch.length;i++) {
			int a=0,b=0;
			// converting character to number
			//int a = ch-'0';
			a=Character.getNumericValue(ch[i]);
			b=Character.getNumericValue((i+1)>=ch.length?ch[0]:ch[i+1]);
			int c = a-b>0?a-b:b-a;
			strbld.append(c);
		}
		String str2 = new String(strbld);
		int z=Integer.parseInt(str2);
		return z;
	}

}
