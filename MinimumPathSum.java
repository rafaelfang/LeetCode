public class MinimumPathSum {
	public static int minPathSum(int[][] grid) {
		int rowNum = grid.length;
		int colNum = grid[0].length;
		if (grid == null || rowNum == 0 || colNum == 0) {
			return 0;
		}
		int[][] minGrid = new int[rowNum][colNum];
		minGrid[0][0] = grid[0][0];
		for (int i = 1; i < rowNum; i++) {
			minGrid[i][0] = minGrid[i-1][0] + grid[i][0];
		}
		for (int j = 1; j < colNum; j++) {
			minGrid[0][j] = minGrid[0][j-1] + grid[0][j];
		}
		for (int i = 1; i < rowNum; i++) {
			for (int j = 1; j < colNum; j++) {
				minGrid[i][j] = Math.min(minGrid[i][j - 1], minGrid[i - 1][j])
						+ grid[i][j];
			}
		}
		return minGrid[rowNum-1][colNum-1];
	}
	public static void main(String[] args){
		int[][] grid={{1,2},{5,6},{1,1}};
		System.out.println(minPathSum(grid));
	}
	

}
