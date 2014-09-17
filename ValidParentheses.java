package edu.missouri.cf797.leetcode;

import java.util.Stack;

public class ValidParentheses {
	public static boolean isValid(String s) {

		char[] arr = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		if (arr.length == 0) {
			return false;
		}
		stack.push(arr[0]);
		char top;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == '(' || arr[i] == '[' || arr[i] == '{') {
				stack.push(arr[i]);
				continue;
			}

			if (stack.empty()) {
				return false;
			} else {
				top = stack.peek();
			}

			if (arr[i] == ')' && top != '(') {
				return false;
			}
			if (arr[i] == ']' && top != '[') {
				return false;
			}
			if (arr[i] == '}' && top != '{') {
				return false;
			}
			stack.pop();
		}
		if (stack.size() != 0) {
			return false;
		}
		return true;

	}

	public static void main(String[] args) {
		String s = "[])";
		System.out.println(isValid(s));
	}
}
