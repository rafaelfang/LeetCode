package edu.missouri.cf797.leetcode;

public class CheckStringContainsSubstring {
	public static void main(String[] args){
		String str="MICROSOFT";
		String substr="ROSA";
		String substr2="ROS";
		System.out.println(isContainingSubstr(str,substr));
		System.out.println(isContainingSubstr(str,substr2));
	}
	
	public static boolean isContainingSubstr(String str, String substr){
		
		
		char[] sub=substr.toCharArray();
		for(int i=0;i<sub.length-1;i++){
			if(str.indexOf(sub[i+1])-str.indexOf(sub[i])!=1){
				return false;
			}
		}
		return true;
	}
}
