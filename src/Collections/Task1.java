package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Task1 {

	static ArrayList<String> arrayList1 = new ArrayList<>();

	public static Set<String> unique(ArrayList<String> arrayList1) {
		Set<String> set = new HashSet<>();
		for (String s : arrayList1) {
			set.add(s);		
		}
		System.out.println(set);
		return set;
		//			Set<String> set = new HashSet<>(arrayList1);
		//			System.out.println(set);
	}

	public static Integer countTimes(String sForSet) {
		Integer result = 0;
		for (String sForArrayList : arrayList1) {
			if (sForArrayList.equals(sForSet)) {
				result = result + 1;
			}
		}
		return result;
	}

	public static void main(String[] args) {

		arrayList1.add("Alfa");
		arrayList1.add("Betta");
		arrayList1.add("Gamma");
		arrayList1.add("Betta");
		arrayList1.add("Omega");
		arrayList1.add("Alfa");
		arrayList1.add("Vega");
		arrayList1.add("Omega");
		System.out.println(arrayList1);

		unique(arrayList1);

		HashMap<String,Integer> targetList = new HashMap<>();
		for (String s : unique(arrayList1)) {
			targetList.put(s, countTimes(s)); 
		}
		System.out.println(targetList);
	}

}
