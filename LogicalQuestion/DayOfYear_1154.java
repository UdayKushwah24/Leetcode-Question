package Leetcode.LogicalQuestion;

public class DayOfYear_1154 {
    public static int dayOfYear(String date) {
        int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        // Leap year check: if it's a leap year and month > Feb, add 1
        if (isLeapYear(year) && month > 2) {
            day++;
        }

        // Add days from previous months
        for (int i = 0; i < month - 1; i++) {
            day += monthDays[i];
        }

        return day;
    }

    private static boolean isLeapYear(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    public static void main(String[] args) {
        String date1 = "2019-01-09"; // Output: 9
        String date2 = "2019-02-10"; // Output: 41
        String date3 = "2000-03-01"; // Output: 61 (leap year)

        System.out.println(dayOfYear(date1));
        System.out.println(dayOfYear(date2));
        System.out.println(dayOfYear(date3));
    }
}
