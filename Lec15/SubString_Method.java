package Lec15;

import java.util.Scanner;

public class SubString_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();// user input
		String s = "helol";
		System.out.println(s.substring(2, 5));
		System.out.println(s.substring(0, 0));
		System.out.println(s.substring(2));

	}

}
