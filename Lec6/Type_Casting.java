package Lec6;

import java.util.Scanner;

public class Type_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		byte b = (byte) (428);
		int a = 10;
		short s = 10;
		long l = 10000000000l;
		System.out.println(b);
		b = 6;
		a = b;
		System.out.println(a);
		a = sc.nextInt();
		l = sc.nextLong();
		b = sc.nextByte();
		s = sc.nextShort();
		boolean m=true;
		boolean n=false;
		m=sc.nextBoolean();

	}

}
