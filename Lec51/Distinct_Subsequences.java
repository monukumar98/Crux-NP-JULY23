package Lec51;

import java.util.Arrays;

public class Distinct_Subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rabbbit";// coins
		String t = "rabbit";// amount
		int[][] dp = new int[t.length()][s.length()];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Coin_Change(s, t, 0, 0, dp));
	}
	// i-->s-->coin
	// j-->t-->amount
	public static int Coin_Change(String s, String t, int i, int j, int[][] dp) {
		if (j == t.length()) {
			return 1;
		}
		if (i == s.length()) {
			return 0;
		}
		if (dp[j][i] != -1) {
			return dp[j][i];
		}
		int inc = 0, exc = 0;
		if (s.charAt(i) == t.charAt(j)) {
			inc = Coin_Change(s, t, i + 1, j + 1, dp);
		}
		exc = Coin_Change(s, t, i + 1, j, dp);
		return dp[j][i] = exc + inc;
	}

}
