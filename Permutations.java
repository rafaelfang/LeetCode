import java.util.ArrayList;
import java.util.List;

public class Permutations {

	public static List<List<Integer>> permute(int[] num) {
		int n = num.length;
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		generate(n, num,result);
		return result;

	}

	private static void generate(int n, int[] num, List<List<Integer>> result) {

		if (n == 1) {
			result.add((array2List(num)));
		} else {
			int j = 0;
			for (int i = 1; i <= n; i++) {
				generate(n - 1, num, result);
				if (n % 2 != 0) {
					j = 1;
				} else {
					j = i;
				}
				swap(num, j - 1, n - 1);

			}
		}

	}

	private static List<Integer> array2List(int[] arr) {
		List<Integer> myList = new ArrayList<Integer>();
		for (Integer a : arr) {
			myList.add(a);
		}
		return myList;
	}

	private static void printArr(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();

	}

	private static void swap(int[] num, int i, int j) {
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;

	}

	public static void main(String[] args) {
		int[] num = { 1, 2, 3 };
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		generate(3, num,result);
		System.out.println(result);
	}

}
