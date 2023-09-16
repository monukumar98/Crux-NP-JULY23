package Lec18;

public class Power_tail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 6;
	}

	public static int pow(int a, int b, int ans) {
		if (b == 0) {
			return ans;
		}

		return pow(a, b - 1, ans * a);
	}

}
