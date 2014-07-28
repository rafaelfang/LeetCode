package edu.missouri.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
	public static List<List<Integer>> subsets(int[] S) {

		Arrays.sort(S);
		List<Integer> data = new ArrayList<Integer>();
		for (Integer s : S) {
			data.add(s);
		}
		return getSubset(data);

	}

	private static List<List<Integer>> getSubset(List<Integer> data) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (data.size() == 0) {
			List<Integer> nullList = new ArrayList<Integer>();
			result.add(nullList);
			return result;
		} else {
			int last = data.remove(data.size() - 1);

			List<List<Integer>> mediate = getSubset(data);
			result.addAll(mediate);

			for (int i = 0; i < mediate.size(); i++) {
				List<Integer> temp = new ArrayList<Integer>();
				temp.addAll(mediate.get(i));
				temp.add(last);
				result.add(temp);
			}

			return result;
		}

	}

	public static void main(String[] args) {
		int[] S = { 1 };
		System.out.println(subsets(S));

	}
}
