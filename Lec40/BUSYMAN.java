package Lec40;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BUSYMAN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			Pair[] p = new Pair[n];
			for (int i = 0; i < p.length; i++) {
				int st = sc.nextInt();
				int et = sc.nextInt();
				p[i] = new Pair(st, et);
			}
			Arrays.sort(p, new Comparator<Pair>() {

				@Override
				public int compare(Pair o1, Pair o2) {
					// TODO Auto-generated method stub
					return o1.et - o2.et;
				}
			});
			int activities = 1;
			int end = p[0].et;
			for (int i = 1; i < p.length; i++) {
				if (end <= p[i].st) {
					activities++;
					end = p[i].et;
				}
			}
			System.out.println(activities);
		}

	}

	static class Pair {
		int st;
		int et;

		public Pair(int st, int et) {
			// TODO Auto-generated constructor stub
			this.st = st;
			this.et = et;
		}
	}

}
