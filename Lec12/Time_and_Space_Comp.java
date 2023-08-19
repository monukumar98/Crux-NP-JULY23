package Lec12;

public class Time_and_Space_Comp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		long strat = System.currentTimeMillis();
//		for (int i = 0; i < 1000_000; i++) {
//
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end - strat);
//		System.out.println("Welcome to Coding Blocks");
//		System.out.println("Welcome to Coding Blocks");
//		System.out.println("Welcome to Coding Blocks");
//		System.out.println("Welcome to Coding Blocks");
//		System.out.println("Welcome to Coding Blocks");

		int n = 100000;

		int i = 0;
		while (i < n) {
			System.out.println("Hey");
			// O(N)
			i++;
		}
		while (i < n) {
			System.out.println("Hey");
			// O Log(N)
			i *= 2;
		}

		while (n > 0) {
			System.out.println("Hey");
			// O Log(N)
			n /= 2;
		}
		while (i <= n) {
			System.out.println("Hey");
			// O(N)
			i += 2;
			i += 3;
		}
		while (i <= n) {
			System.out.println("Hey");
			// O Log(N) base 6
			i *= 2;
			i *= 3;
		}
		while (n > 0) {
			System.out.println("Hey");
			// O Log(N) base 6
			n /= 2;
			n /= 3;
		}
		int k = 2;
		while (i <= n) {
			System.out.println("Hey");
			// O(N/K)
			i += k;
		}
		while (i <= n) {
			System.out.println("Hey");
			// O Log(N) base k
			i *= k;
		}
		while (n > 0) {
			System.out.println("Hey");

			n = n - 1;
		}
		while (n > 0) {
			System.out.println("Hey");

			n = n - 2;
			n = n - 3;
		}
		while (n > 0) {
			n = n - k;
		}

		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				// O(N^2)
				System.out.println("hey");
			}
		}
		for (i = 1; i * i <= n; i++) {
			// O(Sqrt(N)
			System.out.println("hey");
		}

		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i * i; j++) {
				for (k = 1; k <= n / 2; k++) {
					System.out.println("hey");
					// O(N^4)
				}
			}
		}

		for (i = 1; i <= n; i *= 2) {
			// O Log(N)
			System.out.println("hey");
		}

		for (i = n / 2; i <= n; i++) {
			for (int j = 1; j <= n / 2; j++) {
				for (k = 1; k <= n; k = k * 2) {
					System.out.println("hey");
					// O(N^2(Log(N))
				}
			}
		}

		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j += i) {
				System.out.println("hey");
				// O(Log(N))
			}
		}

		// bubble
		// Selection
		// instersion
	}

}
