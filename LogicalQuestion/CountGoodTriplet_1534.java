package Leetcode.LogicalQuestion;

 
public class CountGoodTriplet_1534 {
    public static int countGoodTriplets(int[] nums, int a, int b, int c) {
     
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {                    
                    if (Math.abs(nums[i] - nums[j]) <= a && Math.abs(nums[j] - nums[k]) <= b && Math
                    .abs(nums[k] - nums[i]) <= c ) {
                                count++;
                        
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {3,0,1,1,9,7};
        int a = 7, b = 2, c = 3;
        System.out.println(countGoodTriplets(arr, a, b, c));
    }
}
