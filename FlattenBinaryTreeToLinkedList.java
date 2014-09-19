package edu.missouri.cf797.leetcode;

public class FlattenBinaryTreeToLinkedList {
	
	
	
	public static void flatten(TreeNode root) {
		if(root==null){
			return;
		}
		if(root.left!=null){
			TreeNode rightT=root.right;
			root.right=root.left;
			root.left=null;
			TreeNode rightMost=root.right;
			while(rightMost.right!=null){
				rightMost=rightMost.right;
			}
			rightMost.right=rightT;
		}
		flatten(root.right);
	}

	public static void printTree(TreeNode root){
		while(root!=null){
			System.out.println(root.val);
			root=root.right;
		}
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right = new TreeNode(5);
		root.right.right = new TreeNode(6);
		flatten(root);
		printTree(root);
	}
}
