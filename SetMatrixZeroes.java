package edu.missouri.cf797.leetcode;

public class SetMatrixZeroes {
	public static void setZeroes(int[][] matrix) {
		if (matrix.length == 0) {
			return;
		}
		int row = matrix.length;
		int col = matrix[0].length;
		int zeroRow = 0;
		int zeroCol = 0;
		for (int i = 0; i < col; i++) {
			if (matrix[0][i] == 0) {
				zeroRow = 1;
			}
		}
		for (int i = 0; i < row; i++) {
			if (matrix[i][0] == 0) {
				zeroCol = 1;
			}
		}
		for (int i = 1; i < row; i++) {
			for (int j = 1; j < col; j++) {
				if (matrix[i][j] == 0) {
					matrix[0][j] = 0;
					matrix[i][0] = 0;
				}
			}
		}
		for (int i = 1; i < row; i++) {
			for (int j = 1; j < col; j++) {
				if (matrix[i][0] == 0 || matrix[0][j] == 0) {
					matrix[i][j] = 0;
				}
			}
		}
		if (zeroRow == 1) {
			for (int i = 0; i < col; i++) {
				matrix[0][i] = 0;
			}
		}
		if (zeroCol == 1) {
			for (int i = 0; i < row; i++) {
				matrix[i][0] = 0;
			}
		}
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
		int[][] arr = { { 0, 0, 0, 5 }, { 4, 3, 1, 4 }, { 0, 1, 1, 4 },
				{ 1, 2, 1, 3 }, { 0, 0, 1, 1 } };

		printArr(arr);
		System.out.println();
		setZeroes(arr);
		printArr(arr);
	}
}
