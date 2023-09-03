package Lec17;

public class Wrapper_Class_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		Integer a1 = 91;
		System.out.println(a);
		System.out.println(a1);

		a1 = a;// auto-boxing

		int b = 19;
		Integer b1 = 11;
		b = b1;// On-Boxing

		Integer c1 = 18;
		Integer c2 = 18;
		Integer c3 = 183;
		Integer c4 = 183;
		System.out.println(c1 == c2);
		System.out.println(c3 == c4);
	}

}
