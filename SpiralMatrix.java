import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<Integer>();
		
		if (matrix==null || matrix.length == 0) {
			return result;
		}
		int m = matrix.length;
		int n = matrix[0].length;
		int k = 0;
		int t = 0;
		
		while (k < m && t < n) {
			for (int i = t; i < n; i++) {
				result.add(matrix[k][i]);
			}
			k++;
			for (int i = k; i < m; i++) {
				result.add(matrix[i][n - 1]);
			}
			n--;
			if (k < m) {
				for (int i = n - 1; i >= t; i--) {
					result.add(matrix[m - 1][i]);
				}
				m--;
			}
			if (t < n) {
				for (int i = m - 1; i >= k; i--) {
					result.add(matrix[i][t]);
				}
				t++;
			}
		}
		return result;
		
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(spiralOrder(arr));
	}

	
}
