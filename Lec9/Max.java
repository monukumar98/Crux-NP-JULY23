package Lec9;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 1, 6, 4, 9, 8, 11, 45, -9, 1 };
		System.out.println(maxvalue(arr));
	}

	public static int maxvalue1(int[] arr) {
		int m = Integer.MIN_VALUE;// -2^31
		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > m) {
//				m = arr[i];
//			}
			m = Math.max(m, arr[i]);

		}
		return m;

	}

	public static int maxvalue(int[] arr) {
		int m = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > m) {
				m = arr[i];
			}

		}
		return m;

	}

}
