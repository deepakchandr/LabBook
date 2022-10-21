package Lab9;

import java.awt.color.ColorSpace;

import javax.lang.model.element.NestingKind;

//Exercise 2: Write a method that uses lambda expression to format a given string, where a space is inserted between each character of string.  For ex., if input is “CG”, then expected output is “C G”.

public class Exercise2 {
	
	interface infstr{
		StringBuilder space(String str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="CG";
		StringBuilder result = new StringBuilder();
		infstr str1 = (String) -> {
			
			for (int i=0;i<string.length();i++) {
				if (i>0) {
					result.append(" ");
				}
				result.append(string.charAt(i));
			}
			return result;
		};
		System.out.println(str1.space(string));

	}

}
