package Leetcode.LogicalQuestion;

public class ReformatDate_1507 {
    public static String reformatDate(String date) {
        String month[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        String[] a = date.split(" ");
        String ans = a[2];
        ans += "-";
        for (int i = 0; i < 12; i++) {
            if (month[i].equals(a[1])) {
                if (i < 9) {
                    ans += "0" + (i + 1);
                } else {
                    ans += (i + 1);
                }
                ans += "-";
                break;
            }
        }
        // System.out.println(a[0]);
        // System.out.println(a[0].substring(0, a[0].length() - 2));
        // System.out.println(a[0].substring(0, a[0].length() - 2).length());
        if (a[0].substring(0, a[0].length() - 2).length() == 2) {   
            ans += a[0].substring(0, a[0].length() - 2);
        } else {
            ans += "0"+a[0].substring(0, a[0].length() - 2);
        }
        return ans;
    }

    public static void main(String[] args) {
        // String date = "6th Jun 1933";
        String date = "20th Oct 2052";
        System.out.println(reformatDate(date));
    }
}
