package Lec32;

import Lec30.Queue;

public class DynamicQueue extends Queue {
	@Override

	public void Enqueue(int item) throws Exception {
		if (isFull()) {
			int[] ar = new int[2 * arr.length];
			for (int i = 0; i < arr.length; i++) {
				int idx = (front + i) % arr.length;
				ar[i] = arr[idx];

			}
			arr = ar;
			front = 0;

		}
		super.Enqueue(item);
	}
	public static void main(String[] args) throws Exception {
		DynamicQueue dq = new DynamicQueue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		dq.Enqueue(50);
		System.out.println(dq.Dequeue());
		System.out.println(dq.Dequeue());
		dq.Enqueue(60);
		dq.Enqueue(70);
		dq.Enqueue(80);
		dq.Enqueue(90);
		dq.Display();
	}

}
