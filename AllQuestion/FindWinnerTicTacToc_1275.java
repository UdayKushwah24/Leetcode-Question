package Leetcode.AllQuestion;

public class FindWinnerTicTacToc_1275 {
    public static String tictactoe(int[][] moves) {
        int[][] grid = new int[3][3];
        boolean flag = true;
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < moves[0].length; j++) {
                if (flag)
                    grid[moves[i][0]][moves[i][1]] = 1;
                else
                    grid[moves[i][0]][moves[i][1]] = 2;
            }
            flag = !flag;
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        if (grid[0][0] == 1 && grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]) {
            return "A";
        }
        if (grid[0][0] == 2 && grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]) {
            return "B";
        }

        if (grid[0][2] == 1 && grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0]) {
            return "A";
        }
        if (grid[0][2] == 2 && grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0]) {
            return "B";
        }

        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0] == 1 && grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2]) {
                return "A";
            }
            if (grid[i][0] == 2 && grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2]) {
                return "B";
            }
        }
        for (int i = 0; i < grid.length; i++) {
            if (grid[0][i] == 1 && grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i]) {
                return "A";
            }
            if (grid[0][i] == 2 && grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i]) {
                return "B";
            }
        }
        
        return moves.length == 9 ? "Draw" : "Pending";

    }

    public static void main(String[] args) {
        // int[][] moves = {{0,0},
        // {2,0},
        // {1,1},
        // {2,1},
        // {2,2}};

        // int[][] moves = { { 0, 0 }, { 1, 1 }, { 0, 1 }, { 0, 2 }, { 1, 0 }, { 2, 0 } };

        int[][] moves = {{0,0},{1,1},{2,0},{1,0},{1,2},{2,1},{0,1},{0,2},{2,2}};
        System.out.println(tictactoe(moves));
    }
}
