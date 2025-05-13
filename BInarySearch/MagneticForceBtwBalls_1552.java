// same as Aggressive cow question

package Leetcode.BInarySearch;

import java.util.Arrays;

public class MagneticForceBtwBalls_1552 {
    
    public static void main(String[] args) {
        int stall[] = { 1,2,3,4,5,6,7,8,9,10 };
        // int stall[] = { 1, 2, 8, 4, 9 };
        int cow = 5;
        Arrays.sort(stall);
        System.out.println(AggresiveCow(stall, cow));
    }

    
    public static boolean isSit(int[] stall,int cow, int mid) {
        int nc = 1;
        int pos = stall[0];
        for (int i = 0; i < stall.length; i++) {
            if(stall[i] - pos >= mid ) {
                nc++;
                pos = stall[i];
            }
            if(cow == nc) {
                return true;
            }
        }
        return false;
    }
    public static int AggresiveCow(int[] stall, int cow) {
        int high = stall[stall.length - 1] - stall[0];
        int low = 0;
        int min = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (isSit(stall,cow, mid)) {
                min = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return min;
    }

}
