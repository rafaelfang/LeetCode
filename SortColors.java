package edu.missouri.cf797.leetcode;

public class SortColors {
	public static void sortColors(int[] A) {
		int red = 0;
		int blue = A.length - 1;
		int i = 0;

		while (i < blue + 1) {
			if (A[i] == 0) {
				swap(A, red, i);
				red++;
				i++;
				continue;
			} else if (A[i] == 2) {
				swap(A, blue, i);
				blue--;
				continue;
			} else {
				i++;
			}

		}
		/*
		for (int k = 0; k < A.length; k++) {
			System.out.println(A[k]);
		}*/

	}

	private static void swap(int[] A, int i, int j) {
		int temp;
		temp = A[i];
		A[i] = A[j];
		A[j] = temp;

	}

	public static void main(String[] args) {
		int[] A = { 1, 0, 2, 0, 1, 1, 2 };
		sortColors(A);
	}
}
