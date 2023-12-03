package Lec38;

public class Binary_Search_Tree {
	class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;

	public Binary_Search_Tree(int[] arr) {
		// TODO Auto-generated constructor stub
		root = createTree(arr, 0, arr.length - 1);
	}

	private Node createTree(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		if (si > ei) {
			return null;
		}
		int mid = (si + ei) / 2;
		Node nn = new Node();
		nn.val = arr[mid];
		nn.left = createTree(arr, si, mid - 1);
		nn.right = createTree(arr, mid + 1, ei);
		return nn;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 };
		Binary_Search_Tree bst = new Binary_Search_Tree(arr);
	}

}
