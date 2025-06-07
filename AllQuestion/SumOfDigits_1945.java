package Leetcode.AllQuestion;

public class SumOfDigits_1945 {

    public static int getLucky(String s, int k) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 3, 4, 5, 6, 7, 8 };
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a' ;
            // while (idx > 0) {
            //     sum += idx % 10;
            //     idx /= 10;
            // }.
            sum += arr[idx];
        }

        while (k > 1) {
            int tempSum = 0;
            while (sum > 0) {
                int rem = sum % 10;
                tempSum += rem;
                sum /= 10;
            }
            sum = tempSum;
            k--;
        }

        return sum;
    }

    public static void main(String[] args) {
        String s = "iiii";
        int k = 1;
        System.out.println(getLucky(s, k));
    }
}
