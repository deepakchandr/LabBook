package Lab6;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> marks = new LinkedHashMap<>();
		//Inserting marks 
		marks.put("B", 8);
		marks.put("D", 9);
		marks.put("A", 6);
		marks.put("F", 5); 
		marks.put("C", 10);
		marks.put("E", 9);
		System.out.println(getValues(marks));

	}
	static List<Integer> getValues(Map<String, Integer> marks){
		List<Integer> list = new ArrayList<>(marks.values());

		Collections.sort(list);  //sorting
		return list;
	}

}
