package Lec39;

public class Abstract_Demo_Chlid extends Abstract_Demo {

	@Override
	public void Payment() {
		// TODO Auto-generated method stub

	}

	@Override
	public int No_Item() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void fun() {

	}

	public static void main(String[] args) {
		Abstract_Demo_Chlid ab = new Abstract_Demo_Chlid();
		ab.Payment();
	}

}
