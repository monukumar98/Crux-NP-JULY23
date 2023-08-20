package Lec13;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_Cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();// number of stall
			int c = sc.nextInt();// number of cows
			int[] stall = new int[n];
			for (int i = 0; i < stall.length; i++) {
				stall[i] = sc.nextInt();
			}
			Arrays.sort(stall);
			System.out.println(MaximumDistance(stall, c));
			t--;
		}

	}

	public static int MaximumDistance(int[] stall, int c) {

		int si = stall[0];
		int ei = stall[stall.length - 1];
		int ans = 0;
		while (si <= ei) {
			int mid = (si + ei) / 2;
			if (isitpossible(stall, mid, c) == true) {
				ans = mid;
				si = mid + 1;
			} else {
				ei = mid - 1;
			}
		}
		return ans;

	}

	public static boolean isitpossible(int[] stall, int mid, int c) {
		// TODO Auto-generated method stub
		int pos = stall[0];
		int cow = 1;
		for (int i = 1; i < stall.length; i++) {
			if (stall[i] - pos >= mid) {
				cow++;
				pos = stall[i];
			}
			if (cow == c) {
				return true;
			}

		}
		return false;

	}
}
