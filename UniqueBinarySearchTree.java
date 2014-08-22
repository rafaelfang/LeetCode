public class UniqueBinarySearchTree {
	public static void main(String[] args) {
		System.out.println(numTrees(3));
	}

	public static int numTrees(int n) {
		if (n == 1) {
			return 1;
		} else {
			return (numTrees(n - 1)) * (4 * n - 2) / (n + 1);
		}
	}
}
