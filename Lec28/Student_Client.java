package Lec28;

import java.util.ArrayList;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> ll = new ArrayList<>();
//		ArrayList<Integer> ll1 = new ArrayList<>();
//		ll.add(10);
//		ll1.add(130);
		System.out.println("hey");
		Student s1 = new Student();
		s1.name = "Kaju";
		s1.age = 19;
		s1.Intro_yourSelf();
		Student s2 = new Student();
		s2.name = "Kamlesh";
		s2.age = 18;
		s2.Intro_yourSelf();
		s1.SayHey("Ramu");
		Student.fun(9);
		s1.fun(9);
		
	}

}
