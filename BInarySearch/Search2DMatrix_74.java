package Leetcode.BInarySearch;

public class Search2DMatrix_74 {
    
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = 0;
        int n = matrix[0].length - 1;
        while (m < matrix.length && n >= 0) {
            if (matrix[m][n] == target) {
                return true;
            } else if (matrix[m][n] < target){
                m++;
            } else {
                n--;
            }
        }
        
        return false;
    }
    
    
}
