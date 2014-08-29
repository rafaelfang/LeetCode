public class RotateImage {
	public static void rotate(int[][] matrix) {
		int row=matrix.length;
		transpose(matrix,row);
		reverseEachRow(matrix,row);
	}

	private static void reverseEachRow(int[][] matrix,int row) {
		int temp;
		for(int j=0;j<(row/2);j++){
			for(int i=0;i<row;i++){
				temp=matrix[i][row-j-1];
				matrix[i][row-j-1]=matrix[i][j];
				matrix[i][j]=temp;
			}
		}
		
	}

	private static void transpose(int[][] matrix,int row) {
		int temp;
		for(int i=0;i<row-1;i++){
			for(int j=i+1;j<=row-1;j++){
				temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
		
	}
	public static void printArr(int[][] arr,int row){
		for(int i=0;i<row;i++){
			for(int j=0;j<row;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		int[][] matrix={{1,2},{3,4}};
		int row=matrix.length;
		
		printArr(matrix,row);
		transpose(matrix,row);
		printArr(matrix,row);
		reverseEachRow(matrix,row);
		printArr(matrix,row);
	}
}
