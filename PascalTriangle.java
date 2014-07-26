package edu.missouri.java;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public static void main(String[] args) {
		System.out.println(generate(5));
	}

	public static List<List<Integer>> generate(int numRows) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for (int i = 0; i < numRows; i++) {

			result.add(generateTriangle(i));
		}
		return result;
	}

	private static List<Integer> generateTriangle(int maxRows) {
		List<Integer> aList = new ArrayList<Integer>();

		int r, value;

		r = maxRows + 1; // this is the row
		value = 1; // we start from col=1
		for (int c = 0; c <= maxRows; c++) {
			// special case, cannot divide by 0
			if (c > 0) {
				value = value * (r - c) / c;
			}
			aList.add(value);
		}

		return aList;
	}

}
