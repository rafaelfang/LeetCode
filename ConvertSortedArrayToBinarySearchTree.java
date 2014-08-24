public class ConvertSortedArrayToBinarySearchTree {
	public TreeNode sortedArrayToBST(int[] num) {

		if (num.length == 0) {
			return null;
		} else {
			return array2BST(num, 0, num.length - 1);
		}

	}

	private TreeNode array2BST(int[] num, int start, int end) {
		if (start > end) {
			return null;
		} else if (start == end) {
			return new TreeNode(num[start]);
		} else {
			int middle = start + (end - start) / 2;
			TreeNode mid = new TreeNode(num[middle]);
			mid.left = array2BST(num, start, middle - 1);
			mid.right = array2BST(num, middle + 1, end);
			return mid;
		}

	}
}
