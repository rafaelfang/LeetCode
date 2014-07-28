package edu.missouri.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetII {
	public static List<List<Integer>> subsetsWithDup(int[] S) {

		Arrays.sort(S);
		List<Integer> data = new ArrayList<Integer>();
		for (Integer s : S) {
			data.add(s);
		}

		Set<List<Integer>> mySet = new HashSet<List<Integer>>();
		for (List<Integer> r : getSubset(data)) {
			mySet.add(r);
		}
		List<List<Integer>> resultList = new ArrayList<List<Integer>>();
		resultList.addAll(mySet);
		return resultList;

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
		int[] S = { 1, 2, 2 };
		System.out.println(subsetsWithDup(S));
	}
}
