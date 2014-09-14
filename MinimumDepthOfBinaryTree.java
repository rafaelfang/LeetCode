package edu.missouri.cf797.leetcode;

public class MinimumDepthOfBinaryTree {
	public static int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		if (root.left == null & root.right == null) {
			return 1;
		}
		if (root.left == null) {
			return 1 + minDepth(root.right);
		} else if (root.right == null) {
			return 1 + minDepth(root.left);
		} else {
			return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
		}

	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		System.out.println(minDepth(root));
	}
}
