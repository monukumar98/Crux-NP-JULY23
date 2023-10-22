package Lec29;

public class Student {

	private String name = "Kaju";
	private int age = 17;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		try {
		if (age < 0) {
			throw new Exception("bklol age glt hai ");
		}
		this.age = age;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		finally {
			System.out.println("i am in Finally blocks");
		}
	}

//	public void setAge(int age) throws Exception{
//		if (age < 0) {
//			throw new Exception("bklol age glt hai ");
//		}
//		this.age = age;
//	}

//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public int getAge() {
//		return age;
//	}

}
