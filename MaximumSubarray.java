package edu.missouri.java;

public class MaximumSubarray {
	public static int maxSubArray(int[] A) {
		int max_ending_here = A[0];
		int max_so_far = A[0];
		for (int i = 1; i < A.length; i++) {
			max_ending_here = Math.max(A[i], max_ending_here + A[i]);
			max_so_far = Math.max(max_so_far, max_ending_here);
		}
		return max_so_far;

	}

	public static void main(String[] args) {
		int[] A = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(A));
	}
}
