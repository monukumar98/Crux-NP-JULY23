package Lec2;

public class SumTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int i = 1;
		while (i <= 10) {
			int val = n * i;
			if (val % 4 != 0) {
				System.out.println(val);
			}
			i++;

		}

	}

}
