package Lec50;

import java.util.Arrays;

public class House_Robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 3, 1, 7, 1 };
		int[] dp = new int[arr.length];
		Arrays.fill(dp, -1);
		System.out.println(Robber(arr, 0));
		System.out.println(RobberTD(arr, 0, dp));

	}

	public static int Robber1(int[] arr, int i) {
		if (i < 0) {
			return 0;
		}
		int rob = arr[i] + Robber1(arr, i - 2);// dp[i-2]
		int Dont_rob = Robber1(arr, i - 1);// dp[i-1]
		return Math.max(rob, Dont_rob);
	}

	public static int RobberBU(int[] arr) {
		if (arr.length == 1) {
			return arr[0];
		}
		int[] dp = new int[arr.length];

		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);
		for (int i = 2; i < dp.length; i++) {
			int rob = arr[i] + dp[i - 2];
			int Dont_rob = dp[i - 1];
			dp[i] = Math.max(rob, Dont_rob);
		}
		return dp[dp.length - 1];

	}

	public static int RobberTD(int[] arr, int i, int[] dp) {
		if (i >= arr.length) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int rob = arr[i] + RobberTD(arr, i + 2, dp);// dp[i+2]
		int Dont_rob = RobberTD(arr, i + 1, dp);// dp[i+1]
		return dp[i] = Math.max(rob, Dont_rob);
	}

	public static int Robber(int[] arr, int i) {
		if (i >= arr.length) {
			return 0;
		}
		int rob = arr[i] + Robber(arr, i + 2);
		int Dont_rob = Robber(arr, i + 1);
		return Math.max(rob, Dont_rob);
	}

}
