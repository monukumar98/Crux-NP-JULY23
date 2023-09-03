package Lec16;

import java.util.Scanner;

public class Finding_CB_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		System.out.println(CountCbNumber(s));
	}

	public static int CountCbNumber(String str) {
		int count = 0;
		boolean[] visited = new boolean[str.length()];
		for (int len = 1; len <= str.length(); len++) {
			for (int j = len; j <= str.length(); j++) {
				int i = j - len;
				String s = str.substring(i, j);
				long n = Long.parseLong(s);
				if (IsCbnumber(n) == true && isValid(visited, i, j - 1) == true) {
					count++;
					for (int k = i; k < j; k++) {
						visited[k] = true;
					}
				}

			}

		}
		return count;
	}

	public static boolean isValid(boolean[] visited, int i, int j) {
		// TODO Auto-generated method stub
		for (; i <= j; i++) {
			if (visited[i] == true) {
				return false;
			}
		}
		return true;

	}

	public static boolean IsCbnumber(long n) {
		if (n == 0 || n == 1) {
			return false;
		}
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return true;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (n % arr[i] == 0) {
				return false;
			}
		}
		return true;

	}

}
