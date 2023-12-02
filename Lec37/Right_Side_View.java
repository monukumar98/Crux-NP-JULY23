package Lec37;

import java.util.*;

public class Right_Side_View {

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
		public List<Integer> rightSideView(TreeNode root) {
			List<Integer> ll = new ArrayList<>();
			View(root, 1, ll);
			return ll;
		}

		int maxdept = 0;

		public void View(TreeNode root, int cl, List<Integer> ll) {
			if (root == null) {
				return;
			}
			if (maxdept < cl) {
				ll.add(root.val);
				maxdept = cl;
			}
			View(root.right, cl + 1, ll);
			View(root.left, cl + 1, ll);
		}
	}
}





