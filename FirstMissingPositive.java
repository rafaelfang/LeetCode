public class FirstMissingPositive {
	public static int firstMissingPositive(int[] A) {
		if (A.length == 0) {
			return 1;
		}
		for (int i = 0; i < A.length; i++) {
			while (A[i] != i + 1) {
				if (A[i]<= 0 || A[i] > A.length || A[A[i]-1] == A[i]) {
					break;
				}
				swap(A, i, A[i] - 1);
			}
		}
		for (int i = 0; i < A.length; i++) {
			if (A[i] != i + 1) {
				return i + 1;
			}
		}
		return A.length + 1;

	}

	private static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;

	}

	public static void main(String[] args) {
		int A[] = { 3, 4, -1, 1 };
		System.out.println(firstMissingPositive(A));
	}
}
