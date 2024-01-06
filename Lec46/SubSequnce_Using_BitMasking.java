package Lec46;

public class SubSequnce_Using_BitMasking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		PrintSubSequnce(s);

	}
	public static void PrintSubSequnce(String s) {
		int len = s.length();
		for (int i = 0; i < (1 << len); i++) {
			PrintPattern(s, i);
		}
	}
	private static void PrintPattern(String s, int i) {
		// TODO Auto-generated method stub
		int pos = 0;
		while (i > 0) {
			if ((i & 1) != 0) {
				System.out.print(s.charAt(pos));
			}
			pos++;
			i >>= 1;
		}
		System.out.println();
	}

}
