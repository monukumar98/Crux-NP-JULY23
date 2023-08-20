package Lec13;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 6, 7, 11, 13, 15, 18, 19, 20 };
		int item = 13;
		System.out.println(Search(arr, item));
	}

	public static int Search(int[] arr, int item) {
		// TODO Auto-generated method stub
		int si = 0;
		int ei = arr.length - 1;
		while (si <= ei) {
			int mid = (si + ei) / 2;
			if (arr[mid] == item) {
				return mid;
			} else if (arr[mid] > item) {
				ei = mid - 1;
			} else {
				si = mid + 1;
			}
		}
		return -1;

	}

}
