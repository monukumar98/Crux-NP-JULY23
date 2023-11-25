package Lec35;

public class Cycle_removal {
	class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	// O(1)
	public void Addfirst(int item) {
		Node nn = new Node();
		nn.data = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}
	}

	// O(1)
	public void Addlast(int item) {
		if (size == 0) {
			Addfirst(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			tail.next = nn;
			tail = nn;
			size++;
		}

	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");

	}

	private Node GetNode(int k) {
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void CreateCycle() {
		tail.next = GetNode(2);
	}

	public Node hasCycle() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return slow;
			}
		}
		return null;

	}

	public void Cycleremoval1() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		Node start = head;
		while (start != null) {
			Node temp = meet;
			while (temp.next != meet) {
				if (temp.next == start) {
					temp.next = null;
					return;
				}
				temp = temp.next;
			}
			start = start.next;
		}

	}

	public void Cycleremoval2() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		// 1. Cycle length
		int count = 1;
		Node temp = meet;
		while (temp.next != meet) {
			count++;
			temp = temp.next;
		}
		// 2. fast ko count distance move krna
		Node fast = head;
		for (int i = 0; i < count; i++) {
			fast = fast.next;
		}
		// 3. Cycle Break
		Node slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;

	}

	public void floyedCycleRemoval() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		Node fast = meet;
		Node slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
	}

	public static void main(String[] args) {
		Cycle_removal cy = new Cycle_removal();
		cy.Addlast(1);
		cy.Addlast(2);
		cy.Addlast(3);
		cy.Addlast(4);
		cy.Addlast(5);
		cy.Addlast(6);
		cy.Addlast(7);
		cy.Addlast(8);
		cy.CreateCycle();
		cy.Cycleremoval2();
		cy.Display();
	}
}
