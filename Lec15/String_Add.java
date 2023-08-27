package Lec15;

public class String_Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		String s2 = "bye";
//		String s3 =s1.concat(s2);
		String s3 = s1 + s2;
		System.out.println(s3);
		s1 = s1 + "hello";
		String s4 = "hello" + "bye";
		System.out.println(s4.charAt(4));

	}

}
