package Leetcode.LogicalQuestion;

public class LargestTriangleArea_812 {
    
    
    public static double largestTriangleArea(int[][] points) {
        double max = 0.0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    max = Math.max(max, CalArea(points[i], points[j], points[k]));
                }
            }
        }
        return max;
    }
   
    private static double CalArea(int[] x, int[] y, int[] z) {
        int x1 = x[0];
        int y1 = x[1];
        int x2 = y[0];
        int y2 = y[1];
        int x3 = z[0];
        int y3 = z[1];

        double ans = Math.abs((x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2)));
        return ans / 2.0;
    }

    public static void main(String[] args) {
        int[][] points = { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 0, 2 }, { 2, 0 } };
        System.out.println(largestTriangleArea(points));
    }
}
