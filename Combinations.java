import java.util.ArrayList;
import java.util.List;

public class Combinations {
	public static List<List<Integer>> combine(int n, int k) {
		List<Integer> temp = new ArrayList<Integer>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (n < k) {
			return result;
		}
		getComb(result, temp, n, k, 1);
		return result;
	}

	private static void getComb(List<List<Integer>> result, List<Integer> temp,
			int n, int k, int first) {

		for (int i = first; i <= n; i++) {
			temp.add(i);
			if (temp.size() == k) {
				result.add(new ArrayList<Integer>(temp));

			} else {

				getComb(result, temp, n, k, i + 1);

			}
			temp.remove(temp.size() - 1);
		}

	}

	public static void main(String[] args) {
		System.out.println(combine(3, 2));
	}
}
