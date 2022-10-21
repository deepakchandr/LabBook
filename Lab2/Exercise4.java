package Lab2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

//Exercise 4: Create a method which accepts an integer array and removes all the duplicates in the array. Return the resulting array in descending order

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6,4,8,6,4,5,16,8,6,4,4};
		modifyArray(arr);

	}
	static void modifyArray(int[] arr) {
		int noOfDuplicate = 0;		     //count the duplicate
		for(int i=0;i<arr.length;i++) {
			if (arr[i]!=0) {				//Check if the position is zero or not
				for(int j=i+1;j<arr.length;j++) {
					if (arr[i]==arr[j]) {

						arr[j]=0;			//if any intiger is repeated its position is assigned 0
						noOfDuplicate++;
					}
				}
			}
			
		}
		int[] arr1 = new int[(arr.length-noOfDuplicate)];
		int a=0;
		for(int i=0;i<arr.length;i++) {
			if (arr[i]>0) {
				arr1[a]=arr[i];
				a++;
			}
		}
		Arrays.sort(arr1);
		for (int i : arr1) {
			System.out.print(i+" ");
		}
	}

}
