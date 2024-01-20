package Lec51;

import java.util.Arrays;

public class Coin_Change_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = { 1, 2, 5 };
		int amount = 5;
		int[][] dp = new int[amount + 1][coins.length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Coin_Change(coins, amount, 0, dp));
		System.out.println(Coin_ChangeBU(coins, amount));
	}

	public static int Coin_ChangeBU(int[] coins, int amount) {

		int[][] dp = new int[amount + 1][coins.length + 1];
		for (int i = 0; i < dp[0].length; i++) {
			dp[0][i] = 1;
		}
		for (int am = 1; am < dp.length; am++) {
			for (int i = 1; i < dp[0].length; i++) {
				int inc = 0, exc = 0;
				if (am >= coins[i - 1]) {
					inc = dp[am - coins[i - 1]][i];
				}
				exc = dp[am][i - 1];
				dp[am][i] = inc + exc;
			}
		}
		
		return dp[dp.length - 1][dp[0].length - 1];

	}

	public static int Coin_Change(int[] coins, int amount, int idx, int[][] dp) {
		if (amount == 0) {
			return 1;
		}
		if (idx == coins.length) {
			return 0;
		}
		if (dp[amount][idx] != -1) {
			return dp[amount][idx];
		}
		int inc = 0, exc = 0;
		if (amount >= coins[idx]) {
			inc = Coin_Change(coins, amount - coins[idx], idx, dp);
		}
		exc = Coin_Change(coins, amount, idx + 1, dp);
		return dp[amount][idx] = exc + inc;
	}

}
