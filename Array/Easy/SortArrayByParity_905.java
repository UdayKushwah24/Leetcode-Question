package Leetcode.Array.Easy;

public class SortArrayByParity_905 {


    public static int[] Parity(int[] arr) {
         
        int si =0;
        int ei = arr.length-1;
        int[] ans = new int[arr.length];
        for (int i = 0; i < ans.length; i++) {
            if(arr[i]%2 == 0) {
                ans[si] = arr[i];
                si++;
            } else {
                ans[ei] = arr[i];
                ei--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        int[] ans =  Parity(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
