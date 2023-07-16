package Lec2;

public class Post_and_Per {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 7;
		System.out.println(x++);
		System.out.println(x);
		int a = 9;
		System.out.println(++a);
		System.out.println(a);
//		int p = 7;
//		int b = p++ + p-- + 7 - --p + ++p - ++p;
		int p = 5;
		int b = p++ + p-- + 7 - --p + ++p - ++p - --p + ++p;
		int b1 = p++ + --p + p++ - --p + ++p - ++p - --p + ++p + 17 + p++;
		System.out.println(b);
		System.out.println(b1);

	}

}
