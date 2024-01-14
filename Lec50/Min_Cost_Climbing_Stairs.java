package Lec50;

public class Min_Cost_Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		int f = Min_Cost(arr, 0);
		int s = Min_Cost(arr, 1);
		System.out.println(Math.min(f, s));

	}

	public static int Min_Cost(int[] arr, int i) {
		if (i >= arr.length) {
			return 0;
		}
		int f = Min_Cost(arr, i + 1);
		int s = Min_Cost(arr, i + 2);
		return arr[i] + Math.min(f, s);

	}

}
