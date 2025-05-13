package Leetcode.BInarySearch;

import java.util.Arrays;

public class practice {
/* 
    public static void main(String[] args) {
        int stall[] = { 1, 2, 8, 4, 9 };
        int cow = 3;
        Arrays.sort(stall);
        System.out.println(AggresiveCow(stall, cow));
    }

    
    public static boolean isSit(int[] stall,int cow, int mid) {
        int nc = 1;
        int pos = stall[0];
        for (int i = 0; i < stall.length; i++) {
            if(stall[i] - pos >= mid ) {
                nc++;
                pos = stall[i];
            }
            if(cow == nc) {
                return true;
            }
        }
        return false;
    }
    public static int AggresiveCow(int[] stall, int cow) {
        int high = stall[stall.length - 1] - stall[0];
        int low = 0;
        int min = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (isSit(stall,cow, mid)) {
                min = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return min;
    } */


    public static boolean IsItPossible(int[] pages, int student, int mid) {
        int student_c = 1;
        int readPages = 0;
        for (int i = 0; i < pages.length; ) {
            if(readPages+pages[i] <= mid) {
                readPages += pages[i];
                i++;
            
            } else {
                readPages = 0;
                student_c++;
            }
            if(student_c > student) {
                return false;
            }
        }
        return true;
    }
            
    public static void Allocation(int[] pages, int student) {
        int lo = 0;
        int hi = 0;
        for (int i = 0; i < pages.length; i++) {
            hi += pages[i];
        }
        int ans = 0;
        while (lo <= hi) {
            int mid = (lo+hi)/2;
            if(IsItPossible(pages, student, mid)) {
                ans = mid;
                hi = mid-1;
            } else {
                lo = mid+1;
            }
        }
        System.out.println( ans);
    }

    public static void main(String[] args) {
        int[] pages = {10, 20, 30, 40};
        int student = 2;
        Allocation(pages, student);
    }

}
