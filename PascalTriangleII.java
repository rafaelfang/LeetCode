package edu.missouri.java;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
	

	public static List<Long> getRow(int maxRows) {
		List<Long> aList = new ArrayList<Long>();

		int r;
		long value;

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

	public static void main(String[] args) {
		int k = 30;
		System.out.println(getRow(k));
			
			
		
	}
}
