package Leetcode.AllQuestion;

public class StringCompression_443 {
    //  public static int compress(char[] chars) {
    //     String UniqueChar = ""; 
    //     for (int i = 0; i < chars.length-1; i++) {
    //         if (chars[i] != chars[i+1]) {
    //             UniqueChar += chars[i];
    //         }
    //     }
    //     UniqueChar += chars[chars.length-1];
    //     // System.out.println(UniqueChar);
    //     String ans = "";
    //     int j = 0;
    //     for (int i = 0; i < chars.length-1; i++) {
    //         int count=1;
    //         if (j < UniqueChar.length()) {
    //             ans += UniqueChar.charAt(j);
    //             j++;
    //         }
    //         while(i < chars.length-1 && chars[i] == chars[i+1]) {
    //             count++;
    //             i++;
    //         }  
    //         if (count != 1) {
                
    //             ans += count;
    //         }
             
    //     }
         
    //     System.out.println(ans);
    //     for (int i = 0; i < ans.length(); i++) {
    //         chars[i] = ans.charAt(i);
    //     }
    //     return ans.length();
    // } 
    
    
    
     public static int compress(char[] chars) {
         int index = 0; // Write position
        int i = 0;     // Read position

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            // Count occurrences of currentChar
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Write character
            chars[index++] = currentChar;

            // Write count if more than 1
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }
        return index;
    }  

  
    public static void main(String[] args) {
        // char[] chars = {'a'};
        char[] chars = {'a', 'b'};
        // char[] chars = {'a','a','b','b','c','c','c'};
        // char[] chars = {'a', 'b', 'b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(chars));
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]+" ");
        }
    }
}
