package Lec16;

public class Substring_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		PrintSubString(str);
	}

	public static void PrintSubString(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
			
		}
	}

}
