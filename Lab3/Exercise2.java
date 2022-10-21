package Lab3;

//Exercise 2: Create a class containing a method to create the mirror image of a String. The method should return the two Strings separated with a pipe(|) symbol .

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "EARTH";
		getImage(str);

	}
	static void getImage(String str) {
		StringBuilder str1 = new StringBuilder(str);
		StringBuilder str2 = new StringBuilder(str);
		str2.insert(str2.length(), "|");
		System.out.println(str2);
		str2.append(str1.reverse());
		System.out.println(str2);
		
	}

}
