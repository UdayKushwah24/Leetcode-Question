package Leetcode.LogicalQuestion;

import java.util.*;
public class PathCrossing_1496 {
    public static boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        List<String> ll = new ArrayList<>();
        
        ll.add("0,0");
        for (int i = 0; i < path.length(); i++) {
            char ch = path.charAt(i);
            if (ch == 'E') {
                x++;
            } else if (ch == 'W') {
                x--;
            } else if (ch == 'N') {
                y++;
            } else {
                y--;
            }
            String point = x + "," + y;
            
            if (ll.contains(point)) {
                return true;
            }
            ll.add(point);

        }
        return false;
    }

    public static void main(String[] args) {
        String path = "NESWW";
        System.out.println(isPathCrossing(path));
    }
}
