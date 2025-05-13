// x^n <= k, n=?
package Leetcode.BInarySearch;

public class Kth_root {
    public static void main(String[] args) {
        int k = 143;
        int x = 3;
        System.out.println(Pow(k, x));
    }

    private static int Pow(int k, int x) {
        int l = 0;
        int h = k;
        int ans = 1;
        while (l <= h) {
            int mid = (l+h)/2;
            int p = (int)Math.pow(x,mid);
            if(p <= k){
                ans = mid;
                l = mid+1;
            }
            else {
                h = mid-1;
            }
        }
        return ans;
    }
}
