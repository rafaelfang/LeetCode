public class SearchInRotatedSortedArray {
	public static int search(int[] A, int target) {
		if (A == null || A.length <= 0) {
			return -1;
		}
		int left = 0;
		int right = A.length - 1;
		while (left <= right) {
			int m = (left + right) / 2;
			if (A[m] == target) {
				return m;
			}
			if (A[m] >= A[left]) {
				if (A[left] <= target && target < A[m]) {
					right = m - 1;

				} else {
					left = m + 1;
				}
			} else {
				if (A[m] < target && target <= A[right]) {
					left = m + 1;

				} else {
					right = m - 1;
				}
			}

		}
		return -1;
	}

	public static void main(String args) {
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		System.out.println(search(arr, 9));
	}
}
