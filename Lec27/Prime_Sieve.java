package Lec27;

public class Prime_Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		PrintPrime(n);
	}

// false --> prime  true --> not prime
	public static void PrintPrime(int n) {
		boolean[] prime = new boolean[n + 1];
		prime[0] = true;
		prime[1] = true;
		for (int i = 2; i * i <= n; i++) {
			if (prime[i] == false) {
				for (int j = 2; j * i < prime.length; j++) {
					prime[i * j] = true;
				}

			}

		}
		for (int i = 0; i < prime.length; i++) {
			if (prime[i] == false) {
				System.out.print(i + " ");
			}
		}

	}

}
