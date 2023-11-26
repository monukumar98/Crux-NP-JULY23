package Lec36;

import java.util.*;

public class Binary_Tree {
	class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;
	Scanner sc = new Scanner(System.in);

	public Binary_Tree() {
		// TODO Auto-generated constructor stub
		root = CreateTree();
	}

	private Node CreateTree() {
		// TODO Auto-generated method stub
		int item = sc.nextInt();
		Node node = new Node();
		node.val = item;
		boolean hlc = sc.nextBoolean();
		if (hlc) {
			node.left = CreateTree();
		}
		boolean hrc = sc.nextBoolean();
		if (hrc) {
			node.right = CreateTree();
		}
		return node;

	}

	public void Display() {
		Display(root);
	}

	private void Display(Node nn) {
		if (nn == null) {
			return;
		}
		String s = "";
		s = "<--" + s + nn.val + "-->";
		if (nn.left != null) {
			s = nn.left.val + s;
		} else {
			s = "." + s;
		}
		if (nn.right != null) {
			s = s + nn.right.val;
		} else {
			s = s + ".";
		}
		System.out.println(s);
		Display(nn.left);
		Display(nn.right);
	}

	public int max() {
		return max(root);
	}

	private int max(Node nn) {
		if (nn == null) {
			return Integer.MIN_VALUE;
		}
		int l = max(nn.left);
		int r = max(nn.right);
		return Math.max(l, Math.max(r, nn.val));

	}

	public boolean find(int item) {

		return find(root, item);
	}

	private boolean find(Node nn, int item) {
		if (nn == null) {
			return false;
		}
		if (nn.val == item) {
			return true;
		}
		boolean l = find(nn.left, item);
		boolean r = find(nn.right, item);
		return l || r;

	}

	public int ht() {
		return ht(this.root);
	}

	private int ht(Node node) {
		if (node == null) {
			return -1;
		}
		int lh = ht(node.left);
		int rh = ht(node.right);
		return Math.max(lh, rh) + 1;

	}

	public void PreOrder() {
		PreOrder(this.root);
		System.out.println();
	}

	private void PreOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.val + " ");
		PreOrder(node.left);
		PreOrder(node.right);
	}

	public void INOrder() {
		INOrder(this.root);
		System.out.println();
	}

	private void INOrder(Node node) {
		if (node == null) {
			return;
		}
		INOrder(node.left);
		System.out.print(node.val + " ");
		INOrder(node.right);
	}

	public void POStOrder() {
		POStOrder(this.root);
		System.out.println();
	}

	private void POStOrder(Node node) {
		if (node == null) {
			return;
		}
		POStOrder(node.left);
		POStOrder(node.right);
		System.out.print(node.val + " ");
	}

	public void levelorder() {
//		LinkedList<Node> q = new LinkedList<>();
		Queue<Node> q = new LinkedList<>();
		q.add(root);// add last
		while (!q.isEmpty()) {
			Node rv = q.remove();// removefirst
			System.out.print(rv.val+" ");
			if(rv.left!=null) {
				q.add(rv.left);
			}
			if(rv.right!=null) {
				q.add(rv.right);
			}
		}
		System.out.println();

	}

}
