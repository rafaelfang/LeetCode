package edu.missouri.cf797.leetcode;

public class RemoveDuplicatesFromSortedArrayII {
	public static int removeDuplicates(int[] A) {
		int n=A.length;
		if(n<=1){
			return n;
		}
		int count=0,i=0;
		for(int j=1;j<n;j++){
			if(A[i]==A[j]&&count<2){
				count=2;
				i++;
				A[i]=A[j];
			}else if(A[i]!=A[j]){
				i++;
				A[i]=A[j];
				count=0;
			}else if(count==2&&A[i]==A[j]){
				continue;
			}
		}
		return i+1;
	}
	
	public static void main(String[] args){
		int[] arr={1,2,2,2,3,3};
		System.out.println(removeDuplicates(arr));
	}
}
