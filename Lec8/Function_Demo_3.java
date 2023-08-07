package Lec8;

public class Function_Demo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		int a = 8;
		int b = 7;
		int x = Add(a, b);
		// System.out.println(Add(a, b));
		System.out.println(x);
		System.out.println(sub(x, a));
		System.out.println("hello");

	}
	public static int Add(int a, int z) {
		int c = a + z;
		return c;
	}

	public static int sub(int a, int b) {
		int c = a - b;
		return c;
	}

}
