package Lec43;

public class HashMap_Client {
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
		System.out.println(map.get("Ankita"));
		System.out.println(map.get("Ankit"));
		System.out.println(map);
		System.out.println(map.remove("Pooja"));
		System.out.println(map);
	}

}
