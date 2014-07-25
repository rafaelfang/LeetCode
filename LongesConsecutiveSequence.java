package edu.missouri.java;

import java.util.HashSet;
import java.util.Set;

public class LongesConsecutiveSequence {
	public static int longestConsecutive(int[] num) {
		Set<Integer> mySet = new HashSet<Integer>();
		for (Integer n : num) {
			mySet.add(n);
		}

		int longest = 1;
		int low=0;
		int high=0;
		for (int i = 0; i < num.length; i++) {
			int temp=1;
			if (!mySet.contains(num[i])) {
				continue;
			}
			mySet.remove(num[i]);
			low = num[i] - 1;
			while (mySet.contains(low)) {
				mySet.remove(low);
				temp += 1;
				low = low - 1;
			}
			high = num[i] + 1;
			while (mySet.contains(high)) {
				mySet.remove(high);
				temp += 1;
				high = high + 1;
			}
			longest=Math.max(longest,temp);
		}

		return longest;
	}

	public static void main(String[] args) {
		int[] num = { 9,1,4,7,3,-1,0,5,8,-1,6 };
		System.out.println(longestConsecutive(num));
	}
}
