package Leetcode.LogicalQuestion;

public class CheckIfItStraightLine_1232 {

    private static boolean CalArea(int[] x, int[] y, int[] z) {
        int x1 = x[0];
        int y1 = x[1];
        int x2 = y[0];
        int y2 = y[1];
        int x3 = z[0];
        int y3 = z[1];

        int ans = Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)));
        return ans == 0;
    }

    public static boolean checkStraightLine(int[][] points) {
         
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    if (!CalArea(points[i], points[j], points[k]))
                        return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // int[][] coordinates = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 5, 6 }, { 6, 7 } };
        int[][] coordinates = {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};
        System.out.println(checkStraightLine(coordinates));
    }
}
