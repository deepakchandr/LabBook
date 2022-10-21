package Lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;

//Exercise 7: Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {23, 45,71, 92, 134};
		int[] arr1 = getSorted(arr);
//		getSorted(arr);
		for (int i : arr1) {
			System.out.println(i);
		}
		

	}
	static int[] getSorted(int[] arr){
		List<Integer> arrayList = new ArrayList<>();
		for (int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
			
			StringBuilder str = new StringBuilder();
			str.append(arr[i]);
			str.reverse();
			String str1 = str.toString();
			int i1 = Integer.parseInt(str1);
			arrayList.add(i1);
//			arrayList.add(Integer.valueOf(str.toString()));
//			System.out.println(i1);
		}
//		System.out.println(arrayList);
//		Collections.sort(arrayList);
		int[] a = arrayList.stream().sorted().mapToInt(Integer :: intValue).toArray();//sorting the array list and converting integer to int array
////		int[] objects = (int[]) arrayList.toArray();
//		for (int i =0; i<arrayList.size();i++) {
//			a[i]=(int)(arrayList.get(i));
//			System.out.println(a[i]);
//		}
//		for(int j=0;j<a.length;j++) {
//			System.out.println(a[j]);
//		}
		
		return a;
		
	}

}
