package Lab3;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] degreedays = new int[] { 4, 5, 8, 6, 2};
		for (int counter = 0; counter < degreedays.length; ++counter) {
		    int diff = counter == 0 ? 0 : degreedays[counter] - degreedays[counter - 1];
		    System.out.println("\t" + degreedays[counter] + "\t\t\t" + diff);
		}

	}

}
