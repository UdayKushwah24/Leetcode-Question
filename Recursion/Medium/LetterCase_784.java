<<<<<<< HEAD
package Leetcode.Recursion.Medium;

import java.util.ArrayList;
import java.util.List;

public class LetterCase_784 {
    

    public static void LetterPermutation(List<String> lst, String s, int i, String ans) {
        
        if(i == ans.length()) {
            lst.add(ans);
            return;
        }
        char ch = s.charAt(0);
        int ascii = (int)(ch);
        if(ascii>=65 && ascii<=90) {
            LetterPermutation(lst, s.substring(1), i , ans+ch);
            char d = (char)(ch+32);
            LetterPermutation(lst, s.substring(1), i , ans+d);
            
        }  else if(ascii>=97 && ascii<=122){
            LetterPermutation(lst, s.substring(1), i , ans+ch);
            char d = (char)(ch-32);
            LetterPermutation(lst, s.substring(1), i , ans+d);
        }
        else {
            LetterPermutation(lst, s.substring(1), i , ans+ch);

        }
    }
    public static void main(String[] args) {
        String s = "a1b2";  // c, C
        List<String> lst = new ArrayList<>();
        LetterPermutation(lst,s,s.length(),"");
        System.out.println(lst);
        // System.out.println((int)('a'));
    }
}
=======
package Leetcode.Recursion.Medium;

import java.util.ArrayList;
import java.util.List;

public class LetterCase_784 {
    
    public static void PrintPermutation(String ques, String ans,List<String> lst) {
        if(ques.length() == 0) {
            lst.add(ans);
            return;
        }
        char ch = ques.charAt(0);
        String s2 = ques.substring(1);
        int ascii = (int)ch;
        if((ascii >= 97 && ascii <= 122)||(ascii >= 65 && ascii <= 90)) {

            PrintPermutation(s2, ans+ch,lst);
            char capital = (char)(ch-32);
            PrintPermutation(s2, ans+capital,lst);
        } else {
            PrintPermutation(s2, ans+ch,lst); 
        }
    }
    public static void main(String[] args) {
        String ques = "a1b2";
        // System.out.println('a'-'A');
        List<String> lst = new ArrayList<>();
        PrintPermutation(ques,"",lst);
        System.out.println(lst);


    }
}
>>>>>>> 918d1b89065d474af45ae17753718f3bfe1f7407
