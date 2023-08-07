package Lec9;

public class Swap_demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 9, 6, 4, 9, 8, 11, 45, -9, 1 };
		System.out.println(arr[0] + " " + arr[1]);
		Swap(arr[0], arr[1]);
		System.out.println(arr[0] + " " + arr[1]);
	}
	public static void Swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
