package Lec32;

public class Sum_of_Number {
	public static void main(String[] args) {
		System.out.println(Add(2, 7));
		System.out.println(Add(2, 7, 11));
		System.out.println(Add(2, 7, 9.5));
		System.out.println(Add(2, 3, 4, 45, 5, 6, 6, 6, 6, 6, 6, 11, 6, 6, 6, 10, 6, 6, 6, 6));

	}

	public static int Add(int x, int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;

	}

	public static int Add(int a, int b) {
		return a + b;
	}

	public static int Add(int a, int b, int c) {
		return a + b + c;
	}

	public static int Add(int a, int b, double d) {
		return (int) (a + b + d);
	}

}
