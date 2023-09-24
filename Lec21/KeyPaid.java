package Lec21;

public class KeyPaid {
	static String[] Map = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "23";
		Print(ques, "");
	}
	public static void Print(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		char ch = ques.charAt(0);
		String press = Map[ch - '0'];
		for (int i = 0; i < press.length(); i++) {
			Print(ques.substring(1), ans + press.charAt(i));
		}
	}
}
