package Lec52;

public class Edit_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "FOOD";
		String t = "MONEY";

	}

// i--> s
// j-->t	
	public static int min_operations(String s, String t, int i, int j) {
		if (i == s.length()) {
			return t.length() - j;
		}
		if (j == t.length()) {
			return s.length() - i;
		}
		int min = 0;
		if (s.charAt(i) == t.charAt(j)) {
			min = min_operations(s, t, i + 1, j + 1);
		} else {
			int D = min_operations(s, t, i + 1, j);
			int R = min_operations(s, t, i + 1, j + 1);
			int I = min_operations(s, t, i, j + 1);
			min = Math.min(R, Math.min(D, I)) + 1;
		}
		return min;
	}
}
