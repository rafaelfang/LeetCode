package edu.missouri.cf797.leetcode;

public class PlusOne {
	public static int[] plusOne(int[] digits) {
		if (digits == null || digits.length == 0) {
			return null;
		}
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i] += 1;
				return digits;
			} else {
				digits[i] = 0;
			}
		}
		int[] arr = new int[digits.length + 1];
		arr[0] = 1;
		return arr;

	}

	public static void main(String[] args) {
		int[] a = { 0 };
		int[] b = { 1, 2 };
		printArr(a);
		printArr(b);
		printArr(plusOne(a));
		printArr(plusOne(b));
	}

	public static void printArr(int[] arr) {
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println();
	}

}
