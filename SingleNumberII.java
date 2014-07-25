package edu.missouri.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Given an array of integers, every element appears three times except for one.
 * Find that single one.
 */
public class SingleNumberII {
	public static int singleNumber(int[] A) {
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		for (Integer a : A) {
			if (myMap.containsKey(a)) {
				myMap.put(a, myMap.get(a) + 1);
			} else {
				myMap.put(a, 1);
			}

		}
		Set<Map.Entry<Integer, Integer>> entries = myMap.entrySet();
	
		for (Map.Entry<Integer, Integer> entry : entries) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return Integer.MIN_VALUE;

	}

	public static void main(String[] args) {
		int[] arr = { 3, 3, 2, 3 };
		System.out.println(singleNumber(arr));
	}
}
