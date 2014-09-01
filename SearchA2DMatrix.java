package edu.missouri.cf797.leetcode;

public class SearchA2DMatrix {
	public static boolean searchMatrix(int[][] matrix, int target) {
		if(matrix==null || matrix.length==0||matrix[0].length==0){
			return false;
		}
		int row=matrix.length;
		int col=matrix[0].length;
		int start=0;
		int end=row*col-1;
		while(start<=end){
			int mid=(start+end)/2;
			if(matrix[mid/col][mid%col]==target){
				return true;
			}else if(matrix[mid/col][mid%col]<target){
				start=mid+1;
			}else{
				end=mid-1;
			}
		}
		return false;

	}

	

	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 },
				{ 23, 30, 34, 50 } };
		int target=3;
		System.out.println(searchMatrix(matrix,target));
		
	}
}
