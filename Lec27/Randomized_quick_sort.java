package Lec27;

import java.util.Random;

public class Randomized_quick_sort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 7, 2, 1, 8, 3, 4 };
		Sort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Sort(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		if (si >= ei) {
			return;
		}

		int idx = Partition(arr, si, ei);
		Sort(arr, si, idx - 1);
		Sort(arr, idx + 1, ei);

	}

	public static int Partition(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int k = r.nextInt(ei - si + 1) + si;
		int t = arr[k];
		arr[k] = arr[ei];
		arr[ei] = t;
		int item = arr[ei];
		int idx = si;
		for (int i = si; i < ei; i++) {
			if (arr[i] < item) {
				int temp = arr[idx];
				arr[idx] = arr[i];
				arr[i] = temp;
				idx++;
			}
		}
		int temp = arr[idx];
		arr[idx] = arr[ei];
		arr[ei] = temp;

		return idx;
	}

}
