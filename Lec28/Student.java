package Lec28;

public class Student {
	String name;
	int age;

	public void Intro_yourSelf() {

		System.out.println("My Name is " + this.name + " and age is " + this.age);

	}

	public void SayHey(String name) {

		System.out.println(this.name + " Say Hey " + name);

	}

	public static void fun(int x) {
		System.out.println("I am in Fun " + x);
	}

	static {
		System.out.println("I am in static bloks");
	}

}
