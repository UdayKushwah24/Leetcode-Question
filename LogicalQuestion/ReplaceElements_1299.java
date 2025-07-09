package Leetcode.LogicalQuestion;
 
public class ReplaceElements_1299 {

   /*  public static int[] replaceElements(int[] arr) {
      int[] ans = new int[arr.length];
      ans[arr.length - 1] = -1;
      for (int i = 1; i < ans.length; i++) {
          int max = RightMax(arr, i);
          ans[i - 1] = max;
      }
      return ans;
   }
   
   private static int RightMax(int[] arr, int i) {
      
      int max = Integer.MIN_VALUE;
      for (int j = i; j < arr.length; j++) {
          max = Math.max(max, arr[j]);
      }
      return max;
   }
   public static void main(String[] args) {
      int[] arr = { 17, 18, 5, 4, 6, 1};
      int[] ans = replaceElements(arr);
      for (int i = 0; i < ans.length; i++) {
          System.out.print(ans[i]+" ");
      }
   } */
   
   

    public static int[] replaceElements(int[] arr) {
        int[] ans = new int[arr.length];
        ans[arr.length - 1] = -1;
        for (int i = ans.length - 2; i >= 0; i--) {
            ans[i] = Math.max(ans[i+1], arr[i+1]);
        }
      
        return ans;
    }


   public static void main(String[] args) {
       int[] arr = { 17, 18, 5, 4, 6, 1 };
       int[] ans = replaceElements(arr);
       for (int i = 0; i < ans.length; i++) {
           System.out.print(ans[i] + " ");
       }
   }
}
