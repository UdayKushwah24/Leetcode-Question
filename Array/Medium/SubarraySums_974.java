package Leetcode.Array.Medium;

public class SubarraySums_974 {

 
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6 };
        System.out.println(countSubarrays(arr));
    }

    public static long countSubarrays(int[] arr) {
        int n = arr.length;
        long count = 0;
        int[] sum = new int[n];
        int[] remainder = new int[n];
        long[] remainderFreq = new long[n];

        // Compute prefix sum array
        sum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + arr[i];
        }

        for (int i = 0; i < remainderFreq.length; i++) {
            System.out.print(sum[i]+" ");
        }
        System.out.println();
        // Compute remainder array
        for (int i = 0; i < n; i++) {
            remainder[i] = sum[i] % n;
            if (remainder[i] < 0) {
                remainder[i] += n; // Convert negative remainder to positive equivalent
            }
        }
        for (int i = 0; i < remainderFreq.length; i++) {
            System.out.print(remainder[i]+" ");
        }
        System.out.println();
        
        // Initialize remainder 0 frequency as 1 (to count valid subarrays starting from
        // index 0)
        remainderFreq[0] = 1;
        
        for (int i = 0; i < n; i++) {
            // If this remainder has been seen before, it means we found valid subarrays
            count += remainderFreq[remainder[i]];
            
            // Update frequency of this remainder
            remainderFreq[remainder[i]]++;
        }
        for (int i = 0; i < remainderFreq.length; i++) {
            System.out.print(remainderFreq[i]+" ");
        }
        System.out.println();

        return count;
    }
}
