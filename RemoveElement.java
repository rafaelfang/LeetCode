public class RemoveElement {
	public static int removeElement(int[] A, int elem) {
		int index = 0;
		for (int i = 0; i < A.length; i++) {

			if (A[i] != elem) {
				A[index] = A[i];
				index++;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		int[] A = { 1, -2, 1, 3 };
		System.out.println(removeElement(A, 1));
	}
}
