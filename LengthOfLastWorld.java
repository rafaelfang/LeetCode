package edu.missouri.cf797.leetcode;

public class LengthOfLastWorld {
	public static int lengthOfLastWord(String s) {
		if(s==null){
			return 0;
		}
		if(s.trim()==""){
			return 0;
		}
		String[] arr=s.trim().split(" ");
		char[] charArr=arr[arr.length-1].toCharArray();
		return charArr.length;

	}
	
	public static void main(String[] args){
		String s="Hello World";
		System.out.println(lengthOfLastWord(s));
	}
}
