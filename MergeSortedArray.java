public class MergeSortedArray {
	public static void merge(int A[], int m, int B[], int n) {
		if (n == 0) {

		} else if (m == 0) {
			for(int i=0;i<B.length;i++){
				A[i]=B[i];
			}//here should be A=B for the case when A is empty B is nonempty
		} else {

			int[] temp = new int[m + n];
			for (int i = 0; i < temp.length; i++) {
				if (m >= 1 && n >= 1) {
					if (A[m - 1] > B[n - 1]) {
						temp[i] = A[m - 1];
						m--;
					} else {
						temp[i] = B[n - 1];
						n--;
					}
				} else if (m >= 1 && n < 1) {
					temp[i] = A[m - 1];
					m--;
				} else if (m < 1 && n >= 1) {
					temp[i] = B[n - 1];
					n--;
				} else {
					break;
				}

			}

			
			for (int i = 0; i < temp.length; i++) {
				A[i]=temp[temp.length-i-1];
			}
		}
/*
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}*/

	}

	public static void main(String[] args) {
		int[] A = {  };

		int[] B = { 1 };

		merge(A, 0, B, 1);
	}
}
