package Leetcode.LogicalQuestion;

public class CheckRowColAllNumber_2133 {



    public static boolean checkValid(int[][] matrix) {
        //    for (int i = 0; i < matrix.length; i++) {
        for (int j = 1; j < matrix.length + 1; j++) {
            boolean ans = check(matrix, j);
            if (!ans) {
                return false;
            }
        }
        //    }
        return true;
    }

    private static boolean check(int[][] matrix, int i) {
        int j = matrix.length;
        for (int j2 = 0; j2 < matrix.length; j2++) {
            if (matrix[j]) {
                
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
