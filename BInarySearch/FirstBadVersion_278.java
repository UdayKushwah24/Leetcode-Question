package Leetcode.BInarySearch;

public class FirstBadVersion_278 {

    public static boolean isBadVersion(int n) {
        int bad = 4;
        return bad == n;
    }

    public static int firstBadVersion(int n) {
        int lo = 0;
        int hi = n;
        int ans = 0;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (isBadVersion(mid)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(firstBadVersion(n));
    }
    
}
