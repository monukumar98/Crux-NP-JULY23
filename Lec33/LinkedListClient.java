package Lec33;

public class LinkedListClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.Addfirst(10);
		ll.Addfirst(20);
		ll.Addfirst(30);
		ll.Addlast(90);
		ll.Addatindex(108, 2);
		ll.Display();
		System.out.println(ll.removelast());
		ll.Display();
//		System.out.println(ll.getfirst());
//		System.out.println(ll.getlast());
//		System.out.println(ll.getatindex(2));

	}

}
