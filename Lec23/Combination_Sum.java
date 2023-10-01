package Lec23;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 2, 3, 5 };
		int amount = 10;
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> ll = new ArrayList<>();
		Combonation(coin, amount, ll, 0, ans);
		System.out.println(ans);

	}

	public static void Combonation(int[] coin, int amount, List<Integer> ll, int idx, List<List<Integer>> ans) {
		if (amount == 0) {
			// System.out.print(ll + " ");
			ans.add(new ArrayList<>(ll));
			return;
		}

		for (int i = idx; i < coin.length; i++) {
			if (amount >= coin[i]) {
				ll.add(coin[i]);
				Combonation(coin, amount - coin[i], ll, i, ans);
				ll.remove(ll.size() - 1);
			}

		}

	}

}
