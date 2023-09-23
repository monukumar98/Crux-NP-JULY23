package Lec20;

public class Coint_Toss_count {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		// Toss(n, "");
		// System.out.println(count);
		System.out.println(Toss_count(n, ""));

	}

	public static void Toss(int n, String ans) {
		if (n == 0) {
			System.out.print(ans + " ");
			count++;
			return;
		}
		Toss(n - 1, ans + "H");
		Toss(n - 1, ans + "T");
	}

	public static int Toss_count(int n, String ans) {
		if (n == 0) {
			// System.out.print(ans + " ");

			return 1;
		}
		int a = Toss_count(n - 1, ans + "H");
		int b = Toss_count(n - 1, ans + "T");
		return a + b;
	}

}
