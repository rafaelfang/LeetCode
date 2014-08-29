package edu.missouri.cf797.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

	public static List<String> generateParenthesis(int n) {
		List<String> myList = new ArrayList<String>();
		String str = "";
		generate(n, myList, str, n, n);
		return myList;
	}

	private static void generate(int n, List<String> myList, String str,
			int left, int right) {
		if (left == 0 && right == 0) {
			myList.add(str);
			return;
		}
		if (left > 0) {

			generate(n, myList, str + "(", left - 1, right);
		}
		if (right > left) {

			generate(n, myList, str + ")", left, right - 1);

		}

	}

	public static void main(String[] args) {
		System.out.println(generateParenthesis(2));
	}
}
