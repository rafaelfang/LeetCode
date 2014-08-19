import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraversal {
	public List<Integer> preorderTraversal(TreeNode root) {

		Stack<TreeNode> stack = new Stack<TreeNode>();
		List<Integer> myList = new ArrayList<Integer>();
		stack.push(null);
		TreeNode top = root;

		while (top != null) {
			myList.add(top.val);
			if (top.right != null) {
				stack.push(top.right);
			}
			if (top.left != null) {
				stack.push(top.left);
			}
			top = stack.pop();
		}

		return myList;
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}