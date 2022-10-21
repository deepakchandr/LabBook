package Lab6;
/*
 * Exercise 4:  school offers medals to the students of tenth based on the following criteria 
If(Marks>=90) : Gold 
If(Marks between 80 and 90) : Silver 
If(Marks between 70 and 80) : Bronze 
Note: Marks between 80 and 90 means marks>=80 and marks<90 

 * */
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.sound.midi.Soundbank;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student(1,85);
		Student std2 = new Student(2,95);
		Student std3 = new Student(4,71);
		Student std4 = new Student(5,76);
		HashMap<Integer, Integer> hs = new HashMap<>();
		hs.put(std1.getRegNo(), std1.getMarks());
		hs.put(std2.getRegNo(), std2.getMarks());
		hs.put(std3.getRegNo(), std3.getMarks());
		hs.put(std4.getRegNo(), std4.getMarks());
		System.out.println(getStudents(hs));
		
		
		
	}
	static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> hs){
		HashMap<Integer, String> prize = new HashMap<>();
		
		
		//Using for loop and key set
//		Set<Entry<String, Integer>> setObj= hs.entrySet(); //why showing error
//		Set<Integer> setObj= hs.keySet();
//		for(Integer so:setObj) {
//			
//			if (hs.get(so)>=90) {
//				prize.put(so, "Gold");
//				
//			}
//			else if (hs.get(so)>80 && hs.get(so)<90) {
//				prize.put(so, "Silver");
//			}
//			else if (hs.get(so)>=70 && hs.get(so)<80) {
//				prize.put(so, "Bronze");
//			}
//			
//		}
//		Set<Integer> setObj = hs.keySet();
		
		//Using while loop and iterator
		Iterator<Integer> itr = hs.keySet().iterator();
		while (itr.hasNext()) {
			Integer so = itr.next();
			if (hs.get(so)>=90) {
				prize.put(so, "Gold");
				
			}
			else if (hs.get(so)>80 && hs.get(so)<90) {
				prize.put(so, "Silver");
			}
			else if (hs.get(so)>=70 && hs.get(so)<80) {
				prize.put(so, "Bronze");
			}
			
		}
		
		return prize;
	}

}
