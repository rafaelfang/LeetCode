package edu.missouri.cf797.leetcode;

public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}

		return isSym(root.left, root.right);
	}

	private boolean isSym(TreeNode leftBranch, TreeNode rightBranch) {
		if (leftBranch == null && rightBranch == null) {
			return true;
		}
		if (leftBranch != null && rightBranch == null) {
			return false;
		}
		if (leftBranch == null && rightBranch != null) {
			return false;
		}
		if (leftBranch.val != rightBranch.val) {
			return false;
		}

		if (!isSym(leftBranch.left, rightBranch.right)) {
			return false;
		}
		if (!isSym(leftBranch.right, rightBranch.left)) {
			return false;
		}
		return true;
	}
}
