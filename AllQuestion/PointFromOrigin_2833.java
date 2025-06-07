package Leetcode.AllQuestion;

public class PointFromOrigin_2833 {
    public static int furthestDistanceFromOrigin(String moves) {
        int countR = 0;
        int countL = 0;
        int countSpace = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'R') {
                countR++;
            } else if (moves.charAt(i) == 'L') {
                countL++;
            } else {
                countSpace++;
            }
        }

        return countSpace + Math.max(countR, countL) - Math.min(countR, countL);
    }

    public static void main(String[] args) {
        String moves = "_R__LL_";
        System.out.println(furthestDistanceFromOrigin(moves));
    }
}
