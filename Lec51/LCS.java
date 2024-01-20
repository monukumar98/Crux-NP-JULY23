package Lec51;

import java.util.Arrays;

public class LCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "abcde";
		String text2 = "ace";
		int[][] dp = new int[text1.length()][text2.length()];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(lcs(text1, text2, 0, 0, dp));

	}

	public static int lcsbu(String text1, String text2) {
		int[][] dp = new int[text1.length() + 1][text2.length() + 1];
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				int ans = 0;
				if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
					ans = 1 + dp[i - 1][j - 1];
				} else {
					int f = dp[i - 1][j];
					int s = dp[i][j - 1];
					ans = Math.max(f, s);
				}
				dp[i][j] = ans;
			}
		}
		return dp[dp.length - 1][dp[0].length - 1];
	}

// i--> text1
// j-->text2	
	public static int lcs(String text1, String text2, int i, int j, int[][] dp) {
		if (i == text1.length() || j == text2.length()) {
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int ans = 0;
		if (text1.charAt(i) == text2.charAt(j)) {
			ans = 1 + lcs(text1, text2, i + 1, j + 1, dp);
		} else {
			int f = lcs(text1, text2, i + 1, j, dp);
			int s = lcs(text1, text2, i, j + 1, dp);
			ans = Math.max(f, s);
		}
		return dp[i][j] = ans;
	}

}
