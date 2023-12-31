package Lec46;

public class CountSetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 107;
		System.out.println(countSetbit(n));
		System.out.println(countSetbit_Fast(n));

	}
	public static int countSetbit_Fast(int n) {
		int c = 0;
		while (n != 0) {
			n = n & (n - 1);
			c++;
		}
		return c;
	}
	public static int countSetbit(int n) {
		int c = 0;
		while (n != 0) {
			if ((n & 1) != 0) {
				c++;
			}
			n >>= 1;// n = n >> 1;
		}
		return c;
	}

	

}
