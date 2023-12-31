package Lec46;

//A magic number is defined as a number which can be expressed as a power of 5 or sum of unique powers of 5. First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….
//Write a function to find the nth Magic number.
//Example: 
//Input: n = 2
//Output: 25
//Input: n = 5
//Output: 130 
public class Magic_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12;
		int mul = 5;
		int ans = 0;
		while (n > 0) {
			if ((n & 1) != 0) {
				ans += mul;
			}
			mul *= 5;
			n >>= 1;
		}
		System.out.println(ans);

	}

}
