package Lab2;

import java.util.Iterator;

//Exercise 1: Create a method which accepts an array of integer elements and return the second smallest element in the array

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,2,3,1,4};
		sort(arr);
		System.out.println("Second smallest no is: "+arr[1]);
		

	}
	static void sort(int[] arr) {
		int temp = 0;
		for(int i=arr.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if (arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}
