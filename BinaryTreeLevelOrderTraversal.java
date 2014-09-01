package edu.missouri.cf797.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result=new ArrayList<List<Integer>>();
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		if(root==null){
			return result;
		}
		TreeNode node;
		queue.add(root);
		while(!queue.isEmpty()){
			int queueSize=queue.size();
			List<Integer> list=new ArrayList<Integer>();
			for(int i=0;i<queueSize;i++){
				node = queue.remove();
				list.add(node.val);
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
			}
			
			result.add(list);
		}
		return result;
	}

	

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		System.out.println(levelOrder(root));
	}
}
