package Lab1;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press 1 for -> red\nPress 2 for -> Yellow\nPress 3 for -> Green");
		int n = scanner.nextInt();
		switch (n) {
		case 1:
			System.out.println("Stop");
			break;
		case 2:
			System.out.println("Ready");
			break;
		case 3:
			System.out.println("Go");
			break;	

		default:
			System.out.println();
			break;
		}
	}

}
