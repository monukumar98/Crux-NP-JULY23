package Lec39;

public class Construct_Binary_Tree_from_Preorder_and_Inorder {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public TreeNode buildTree(int[] preorder, int[] inorder) {
			return Create(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);

		}

		public TreeNode Create(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {
			if (ilo > ihi || plo > phi) {
				return null;

			}
			TreeNode node = new TreeNode(pre[plo]);
			int idx = Search(in, ilo, ihi, pre[plo]);
			int nele = idx - ilo;
			node.left = Create(pre, plo + 1, plo + nele, in, ilo, idx - 1);
			node.right = Create(pre, plo + nele + 1, phi, in, idx + 1, ihi);
			return node;

		}

		public int Search(int[] in, int si, int ei, int ele) {
			for (int i = si; i <= ei; i++) {
				if (in[i] == ele) {
					return i;
				}
			}
			return 0;
		}
	}

}
