public class SpiralMatrixII {
	public static int[][] generateMatrix(int n) {
		int[][] arr = new int[n][n];
		int a = n;
		int val = 1;
		for (int i = 0; i < n / 2; i++, a -= 2) {
			for (int col = i; col < i + a; col++) {
				arr[i][col] = val++;
			}
			for (int row = i + 1; row < i + a; row++) {
				arr[row][i + a - 1] = val++;
			}
			for (int col = i + a - 2; col >= i; col--) {
				arr[i + a - 1][col] = val++;
			}
			for (int row = i + a - 2; row > i; row--) {
				arr[row][i] = val++;
			}
			
		}
		if (n % 2 == 1) {
			arr[n / 2][n / 2] = val;
		}
		return arr;
	}

	public static void printArr(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int[][] result = generateMatrix(1);
		printArr(result);
	}
}
