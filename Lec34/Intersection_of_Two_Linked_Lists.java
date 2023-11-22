package Lec34;

public class Intersection_of_Two_Linked_Lists {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public class Solution {
		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
			ListNode y = headA;
			ListNode vgf = headB;
			while (y != vgf) {
				if (y == null) {
					y = headB;
				} else {
					y = y.next;
				}
				if (vgf == null) {
					y = headA;
				} else {
					vgf = vgf.next;
				}
			}
			return y;

		}
	}

}
