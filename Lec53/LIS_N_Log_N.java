package Lec53;

public class LIS_N_Log_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 8, 4, 2, 12, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
		System.out.println(lis(arr));
	}

	public static int lis(int[] arr) {
		int[] dp = new int[arr.length];
		dp[0] = arr[0];
		int len = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > dp[len - 1]) {
				dp[len] = arr[i];
				len++;
			} else {
				int idx = BinarySearch(dp, 0, len - 1, arr[i]);
				dp[idx] = arr[i];
			}
		}
		return len;
	}

	private static int BinarySearch(int[] dp, int si, int ei, int k) {
		// TODO Auto-generated method stub
		int idx = 0;
		while (si <= ei) {
			int mid = (si + ei) / 2;
			if (dp[mid] >= k) {
				idx = mid;
				ei = mid - 1;
			} else {
				si = mid + 1;
			}
		}

		return idx;
	}
}
