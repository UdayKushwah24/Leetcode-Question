package Leetcode.AllQuestion;

import java.util.Arrays;

public class RankTransformArray_1331 {
    public static int[] arrayRankTransform(int[] arr) {
        int ans[] = new int[arr.length];
        int temp[] = new int[arr.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }
        Arrays.sort(arr);
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp.length; j++) {
                if (arr[i] == temp[j]) {
                    ans[i] = j+1;
                    break;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {40,10,20,30};
        // int[] arr = {37,12,28,9,100,56,80,5,12};
        int ans[] = arrayRankTransform(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
