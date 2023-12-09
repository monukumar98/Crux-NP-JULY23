package Lec39;

public interface QueueI {
	public void Enqueue(int item);

	public int Dequeue();

	public int getfront();

	public static final int x = 90;

	// java 8
	static void fun() {

	}

	default void f1() {

	}

	// java 9
	private int f2() {
		return 0;
	}
//public static void main(String[] args) {
//	QueueI q = new QueueI() {
//		
//		@Override
//		public int getfront() {
//			// TODO Auto-generated method stub
//			return 0;
//		}
//		
//		@Override
//		public void Enqueue(int item) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//		@Override
//		public int Dequeue() {
//			// TODO Auto-generated method stub
//			return 0;
//		}
//	};
//}
}
