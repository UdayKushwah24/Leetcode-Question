package Leetcode.LogicalQuestion;

public class StudentAttendance_551 {
    public static boolean checkRecord(String s) {
        boolean late = true;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == 'L' && s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L') {
                late = false;
                break;
            }

        }
        int c = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'A') {
                c += 1;
            }

        }
        boolean absent = true;
        if (c >= 2) {
            absent = false;
        }
        return late && absent;
    }

    
   
    public static void main(String[] args) {
        String s = "AA";
        // String s = "PPALLP";
        // String s = "PPALLL";
        System.out.println(checkRecord(s));
    }
}
