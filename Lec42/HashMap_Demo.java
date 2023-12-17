package Lec42;

import java.util.*;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		// add
		map.put("Raj", 98);
		map.put("Anku", 77);
		map.put("Ankit", 67);
		map.put("Kunal", 69);
		map.put("Ankita", 57);
		map.put("Kaju", 78);
		map.put("Shivam", 49);
		map.put("Pooja", 59);
		map.put("Ankita", 78);
		// map.put(null, 88);
		System.out.println(map);
//		// get
//		System.out.println(map.get("Shiv"));
//		System.out.println(map.get("Ankita"));
//		// containsKey
//		System.out.println(map.containsKey("Anku"));
//		System.out.println(map.containsKey("Anish"));
//
//		// remove
//		System.out.println(map.remove("Anish"));
//		System.out.println(map.remove("Anku"));
//		System.out.println(map);
//		// size
//		System.out.println(map.size());

		TreeMap<String, Integer> map1 = new TreeMap<>();
		// add
		map1.put("Raj", 98);
		map1.put("Anku", 77);
		map1.put("Ankit", 67);
		map1.put("Kunal", 69);
		map1.put("Ankita", 57);
		map1.put("Kaju", 78);
		map1.put("Shivam", 49);
		map1.put("Pooja", 59);
		map1.put("Ankita", 78);
		// map1.put(null, 88);
		System.out.println(map1);
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		// add
		map2.put("Raj", 98);
		map2.put("Anku", 77);
		map2.put("Ankit", 67);
		map2.put("Kunal", 69);
		map2.put("Ankita", 57);
		map2.put("Kaju", 78);
		map2.put("Shivam", 49);
		map2.put("Pooja", 59);
		map2.put("Ankita", 78);
		// map2.put(null, 88);
		System.out.println(map2);
//		Set<String> s = map.keySet();
//		System.out.println(s);
//		for(String key :s) {
//			System.out.println(key +" "+ map.get(key));
//		}

		for (String key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
	}

}
