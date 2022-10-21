package Lab3;

import java.util.Arrays;

import javax.print.DocFlavor.CHAR_ARRAY;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "JAVA";
		char[] charr = str.toCharArray();
		
		for(int i= 0;i<charr.length;i++) {
			char ch = charr[i];
//			System.out.println(ch+"--");
			if (!(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' ||ch =='A'|| ch =='E'|| ch =='I'|| ch =='O'|| ch =='U')) {
				charr[i] = (char)(ch+1);
			}
		}
		str= String.valueOf(charr);
		System.out.println(str);
		
		

	}

}
