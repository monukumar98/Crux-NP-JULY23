package Lec23;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nitin";
		List<String> ll = new ArrayList<>();
		Partitioning(s, ll);
	}

	public static void Partitioning(String ques, List<String> ll ) {
		if (ques.length() == 0) {
			System.out.println(ll);
			return;
		}

		for (int i = 1; i <= ques.length(); i++) {
			String s = ques.substring(0, i);
			if (isPalindrome(s)) {
				ll.add(s);
				Partitioning(ques.substring(i), ll);
				ll.remove(ll.size()-1);
			}

		}
	}

	public static boolean isPalindrome(String s) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;

		}
		return true;
	}
}
