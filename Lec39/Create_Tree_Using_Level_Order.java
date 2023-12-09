package Lec39;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Create_Tree_Using_Level_Order {

	class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;
	Scanner sc = new Scanner(System.in);

	public Create_Tree_Using_Level_Order() {
		// TODO Auto-generated constructor stub
		CreateTree();
	}

	private void CreateTree() {
		// TODO Auto-generated method stub
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		root = nn;
		Queue<Node> q = new LinkedList<>();
		q.add(nn);
		while (!q.isEmpty()) {
			Node rn = q.remove();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 != -1) {
				Node node = new Node();
				node.val = c1;
				rn.left = node;
				q.add(node);
			}
			if (c2 != -1) {
				Node node = new Node();
				node.val = c2;
				rn.right = node;
				q.add(node);
			}
		}

	}

	public static void main(String[] args) {

	}

}
