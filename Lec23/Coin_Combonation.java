package Lec23;

public class Coin_Combonation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 2, 3, 5 };
		int amount = 10;
		Combonation(coin, amount, "", 0);

	}

	public static void Combonation(int[] coin, int amount, String ans, int idx) {
		if (amount == 0) {
			System.out.print(ans + " ");
			return;
		}

		for (int i = idx; i < coin.length; i++) {
			if (amount >= coin[i]) {
				Combonation(coin, amount - coin[i], ans + coin[i], i);
			}

		}

	}

}
