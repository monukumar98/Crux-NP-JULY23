package Lec15;

public class String_Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		String s2 = new String("heplo");
		System.out.println(s1.equals(s2));
		System.out.println(equals(s1, s2));
	}
	public static boolean equals(String s1, String s2) {
		if (s1 == s2) {
			return true;
		} else if (s1.length() != s2.length()) {
			return false;
		}
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}
		return true;

	}
}
