package Lab2;

import java.util.Iterator;
import java.util.Scanner;

//Exercise 3: Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of array you want to input");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter "+n+" arrays");
		for (int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
//			System.out.println(" no is: "+i);
		}
		
		for (int i=0;i<arr.length;i++) {
			if (arr[i]>9) {
				StringBuilder strbld = new StringBuilder();
				strbld.append(arr[i]);
				strbld.reverse();
//				System.out.println(strbld);
				arr[i]=Integer.parseInt(strbld.toString());//conversion from string builder to int
				
			}
		}
		getSorted(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
		

	}
	static void getSorted(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i;j<arr.length-1;j++) {
				if (arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}

}
