package Lab2;

import java.util.Arrays;

//Exercise 2: Create a method that can accept an array of String objects and sort in alphabetical order. The elements in the left half should be completely in uppercase and the elements in the right half should be completely in lower case. Return the resulting array.Note: If there are odd number of String objects, then (n/2) +1 elements should be in UPPPERCASE


public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Logic";
		str=str.toLowerCase();
		sortString(str);
		

	}
	static void sortString(String str) {
		char ch[] = str.toCharArray();//converting string to character array
		char temp;
		//Sorting the character array
		for(int i=ch.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if (ch[j]>ch[j+1]) {
					temp = ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;
				}
			}
		}
		//Converting initial char to upper case
		for(int i=0;i<ch.length;i++) {
			if (ch.length%2==0) {
				if (i<ch.length/2) {
					ch[i]=Character.toUpperCase(ch[i]);//character to upper case
				}
			}
			else {
				if (i<=ch.length/2) {
					ch[i]=Character.toUpperCase(ch[i]);//character to upper case
				}
			}
			
		}
		str = String.valueOf(ch);//converting character array back to string
		System.out.println(str);
	}

}
