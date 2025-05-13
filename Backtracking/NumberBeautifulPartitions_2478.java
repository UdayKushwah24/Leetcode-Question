package Leetcode.Backtracking;

public class NumberBeautifulPartitions_2478 {
 
   /*  public static boolean IsValid(String str) {
        char fi = str.charAt(0);
        int fi_ = fi - '0';
        // System.out.println(fi_);
        char li = str.charAt(str.length() - 1);
        int li_ = li - '0';
        // System.out.println(li_);
        if ((fi_ == 2 || fi_ == 3 || fi_ == 5 || fi_ == 7) && !(li_ == 2 || li_ == 3 || li_ == 5 || li_ == 7)) {
            return true;
        } else {
            return false;
        }
    }

    public static void Partition(String str, String string, int minLength, int k, int partitionCount) {

        if (str.length() == 0 && partitionCount == k) {
            System.out.println(string);
            return;
        }
        for (int i = 1; i <= str.length(); i++) {
            String s = str.substring(0, i);
            if (s.length() >= minLength && IsValid(s)) {
                Partition(str.substring(i), string + s + "|", minLength, k, partitionCount+1);
            }
        }

    }

    public static void main(String[] args) {
        String str = "23542185131";
        int minLength = 2;
        int k = 3;
        Partition(str, "", minLength, k-1,0);
         
    } */
   

   public static boolean IsValid(String str) {
        char fi = str.charAt(0);
        int fi_ = fi - '0';
        // System.out.println(fi_);
        char li = str.charAt(str.length() - 1);
        int li_ = li - '0';
        // System.out.println(li_);
        if ((fi_ == 2 || fi_ == 3 || fi_ == 5 || fi_ == 7) && !(li_ == 2 || li_ == 3 || li_ == 5 || li_ == 7)) {
            return true;
        } else {
            return false;
        }
    }

    public static int Partition(String str, String string, int minLength, int k, int partitionCount) {

        if (str.length() == 0 && partitionCount == k) {
            System.out.println(string);
            return 1;
        } 
        int count = 0;
        for (int i = minLength; i <= str.length(); i++) {
            String s = str.substring(0, i);
            if (IsValid(s)) {
                count += Partition(str.substring(i), string + s + "|", minLength, k, partitionCount+1);
            }
        }
        return count;

    }

    public static void main(String[] args) {
        String str = "23542185131";
        int minLength = 3;
        int k = 3;
       
        System.out.println( Partition(str, "", minLength, k,0));
    } 

 

 


}
