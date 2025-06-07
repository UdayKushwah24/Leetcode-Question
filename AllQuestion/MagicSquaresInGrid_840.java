package Leetcode.AllQuestion;

public class MagicSquaresInGrid_840 {

	public static int numMagicSquaresInside(int[][] grid) {
		int row = grid.length;
		int col = grid[0].length;
		if (row < 3 || col < 3) {
			return 0;
		}

		return 0;

	}
	public static void main(String[] args) {
		int[][] grid = {   { 4, 3, 8, 4 },
							{ 9, 5, 1, 9 },
				{ 2, 7, 6, 2 } };
							
		System.out.println(numMagicSquaresInside(grid));
	}
}
