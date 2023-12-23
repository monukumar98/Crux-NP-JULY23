package Lec43;

public class String_Vs_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String_demo();
		StringBuilder_demo();
	}

	public static void String_demo() {
		String s = "";
		for (int i = 0; i < 1000000; i++) {
			s = s + i;
		}
System.out.println(s);
	}

	public static void StringBuilder_demo() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 1000000; i++) {
			sb.append(i);
		}
		System.out.println(sb);
	}

}
