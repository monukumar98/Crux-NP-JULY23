package Lec39;

public abstract class Abstract_Demo {

	public abstract void Payment();

	public void ViewItem() {

	}

	public abstract int No_Item();

	public static void main(String[] args) {
		Abstract_Demo ab = new Abstract_Demo() {

			@Override
			public void Payment() {
				// TODO Auto-generated method stub

			}

			@Override
			public int No_Item() {
				// TODO Auto-generated method stub
				return 0;
			}

		};
		ab.Payment();
//		Abstract_Demo ab1 = new Abstract_Demo() {
//			
//		};
	}

}
