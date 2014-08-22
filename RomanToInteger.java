package edu.missouri.java;

public class RomanToInteger {

	public static void main(String[] args) {
		System.out.println(romanToInt("IV"));
		System.out.println(romanToInt("III"));
		System.out.println(romanToInt("MCMXCVI"));
	}

	public static int romanToInt(String s) {
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			
			if (i>0&&r2i(s.charAt(i)) > r2i(s.charAt(i - 1))) {
				result = result + r2i(s.charAt(i)) - 2* r2i(s.charAt(i - 1));
			} else {
				result = result + r2i(s.charAt(i));
			}
		}

		return result;

	}

	public static int r2i(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}
}
