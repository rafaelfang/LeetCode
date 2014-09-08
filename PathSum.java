package edu.missouri.cf797.leetcode;

public class PathSum {
	public boolean hasPathSum(TreeNode root, int sum) {
		return hasPathSum(root, 0, sum);
	}

	private boolean hasPathSum(TreeNode root, int current, int sum) {
		if (root == null) {
			return false;
		}
		current = current + root.val;
		if (root.left == null && root.right == null) {
			if (current == sum) {
				return true;
			} else {
				return false;
			}
		}
		return hasPathSum(root.left, current, sum)
				|| hasPathSum(root.right, current, sum);
	}
}
