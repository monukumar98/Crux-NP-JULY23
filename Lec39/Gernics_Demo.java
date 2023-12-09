package Lec39;

public class Gernics_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "Raj", "Ankit", "Ankita", "Kaju", "Pooja" };
		Display(arr);
		Integer[] arr1 = { 10, 20, 30, 40, 50, 60, 70 };
		Display(arr1);

	}

	public static <T>void Display(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
