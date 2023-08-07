package Lec9;

public class Array_Reverse_rang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 3, 4, 6, 7, 9, 11, 14, 16, 19, 23, 28, 88, 89 };
		Revser(arr, 3, 11);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Revser(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
