package Leetcode.Array.Medium;

public class LongestPalindromeSub_5 {

    public static boolean CheckPalindrome(String str){
        int n = str.length();
        int i = 0;
        int j = n-1;
        boolean isPalindrome = true;
        while(i <= j) {
            if(str.charAt(i)!=str.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        return isPalindrome;
    }

    public static String longestPalindrome(String str) {
        String ans = "";
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String s = "";
                for (int j2 = i; j2 < j+1; j2++) {
                    s += str.charAt(j2);
                }
                // System.out.println(s);
                if(CheckPalindrome(s)) {
                    int n = s.length();
                    if(n > max) {
                        ans = s;
                        max = n;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // String str = "babad";
        // String str = "cbbd";
        String str = "civilwartestingwhetherthatnaptionoranynaronotionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        System.out.println(longestPalindrome(str));
    }
}
