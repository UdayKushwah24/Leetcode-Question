package Leetcode.Backtracking;

public class SudukoSolver_37 {

    /*
    
    public static boolean isItSafe(int[][] grid, int row, int col, int val) {
        for (int i = 0; i < 9; i++) {
            if(grid[i][col] == val) {
                return false;
            } 
        }
        for (int i = 0; i < 9; i++) {
            if(grid[row][i] == val) {
                return false;
            } 
        }

        row = row - row % 3;
        col = col - col % 3;
        for (int i = row; i < row+3; i++) {
            for (int j = col; j < col+3; j++) {
                 
                if(grid[i][j] == val) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void Display(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Suduko(int[][] grid, int row, int col) {
        
        if(col == 9) {
            col = 0;
            row++;
        }
        if(row == 9) {
            Display(grid);
            return;
        } 
        if(grid[row][col] != 0) {
            Suduko(grid, row, col+1);
        } else {
            for (int val = 1; val <= 9; val++) {
                if(isItSafe(grid, row , col, val)) {
                    grid[row][col] = val;
                    Suduko(grid, row, col+1);
                    grid[row][col] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] grid = {{ 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                        { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                        { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                        { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                        { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                        { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                        { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                        { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                        { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
        Suduko(grid,0,0);
    }

     */

    public static boolean isItSafe(char[][] grid, int row, int col, char val) {
        for (int i = 0; i < 9; i++) {
            if (grid[i][col] == val) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (grid[row][i] == val) {
                return false;
            }
        }

        row = row - row % 3;
        col = col - col % 3;
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {

                if (grid[i][j] == val) {
                    return false;
                }
            }
        }
        return true;
    }

     

    static boolean Solved = false;
    public static void Suduko(char[][] grid, int row, int col) {

        if (col == 9) {
            col = 0;
            row++;
        }
         
        if (row == 9) {
            Solved = true;
            return;
        }

        if (grid[row][col] != '.') {
            Suduko(grid, row, col + 1);
        } else {
            // for (char val = '1'; val <= 9; val++) {
            for (int val = 1; val <= 9; val++) {
                if (isItSafe(grid, row, col,(char)(val+'0'))) {
                    grid[row][col] = (char)(val+'0');
                    Suduko(grid, row, col + 1);
                    if(Solved) {
                        return;
                    }
                    grid[row][col] = '.';
                }
            }
        }
    }

    public static void main(String[] args) {
        char[][] grid = {{'5','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'},
                        {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                        {'4','.','.','8','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},
                        {'.','.','.','.','8','.','.','7','9'}};
        Suduko(grid,0,0);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
        // System.out.println((char)(0+'1'));
        // System.out.println((int)(':'));
        // System.out.println((int)(char)(1));
        // System.out.println((char)(9786));
    }
}
