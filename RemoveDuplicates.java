public class RemoveDuplicates {

	public static void main(String[] args) {

		int[] input = { 1, 2, 2, 3 };
		System.out.println(removeDuplicates(input));
	}

	public static int removeDuplicates(int[] A) {
		if (A.length == 0) {
			return 0;
		} else {
			int cur = 0;
			for (int i = 1; i < A.length; i++) {
				if (A[cur] == A[i]) {
					continue;
				} else {
					cur++;
					A[cur] = A[i];
				}
			}
			return cur + 1;
		}

	}
}
