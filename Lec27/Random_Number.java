package Lec27;

import java.util.Random;

public class Random_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int si = 10;
		int ei = 100;
		for (int i = 0; i < 5; i++) {
			int item = r.nextInt(ei - si + 1) + si;
			System.out.print(item + " ");

		}

	}

}
