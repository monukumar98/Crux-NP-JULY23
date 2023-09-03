package Lec16;

public class Print_SubString_Length {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		PrintSubString(str);
	}
	public static void PrintSubString(String str) {

		for (int len = 1; len <= str.length(); len++) {
			for (int j = len; j <= str.length(); j++) {
				int i = j - len;
				System.out.println(str.substring(i, j));
			}

		}

	}

}
