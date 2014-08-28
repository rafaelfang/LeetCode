public class UniquePaths {
	/*recursive method
	public static int uniquePaths(int m, int n) {
		return getPaths(m, n);

	}

	private static int getPaths(int m, int n) {

		if (m == 0 || n == 0) {
			return 0;
		} else if (m == 1 || n == 1) {
			return 1;
		} else {
			return getPaths(m - 1, n) + getPaths(m, n - 1);
		}

	}
	*/
	
	public static int uniquePaths(int m, int n) {
		if(m==0||n==0){
			return 0;
		}
		int[][] arr=new int[m][n];
		for(int i=0;i<m;i++){
			arr[i][0]=1;
		}
		for(int j=0;j<n;j++){
			arr[0][j]=1;
		}
		for(int p=1;p<m;p++){
			for(int q=1;q<n;q++){
				arr[p][q]=arr[p-1][q]+arr[p][q-1];
			}
		}
		return arr[m-1][n-1];

	}

	public static void main(String[] args){
		System.out.println(uniquePaths(3,7));
	}

}
