package Lec39;

public class Queue_Class implements QueueI {

	@Override
	public void Enqueue(int item) {
		// TODO Auto-generated method stub
		//QueueI.x += 3;
	}

	@Override
	public int Dequeue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getfront() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		Queue_Class q = new Queue_Class();
		q.Enqueue(10);
	}
}
