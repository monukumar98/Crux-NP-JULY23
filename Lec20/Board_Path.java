package Lec20;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		printpath(n, 0, "");

	}

	public static void printpath(int end, int curr, String ans) {
		if (curr == end) {
			System.out.println(ans);
			return;
		}
		if (curr > end) {
			return;
		}
//		printpath(end, curr + 1, ans + 1);
//		printpath(end, curr + 2, ans + 2);
//		printpath(end, curr + 3, ans + 3);
		
		for (int dice = 1; dice <= 3; dice++) {
			printpath(end, curr + dice, ans + dice);
		}

	}

}
