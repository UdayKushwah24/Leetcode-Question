<<<<<<< HEAD
package Leetcode.Recursion.Medium;

public class NumberDice_1155 {
    
    
   /*  public static void RollingDice(int no_of_dice, int target, int currDice, int currSum, String ans, int no_of_face) {
        // Base case: If all dice are used
        if (currDice == no_of_dice) {
            // Check if the current sum matches the target
            if (currSum == target) {
                System.out.println(ans);
            }
            return;
        }

        // Try all possible outcomes for the current die
        for (int i = 1; i <= no_of_face; i++) {
            RollingDice(no_of_dice, target, currDice + 1, currSum + i, ans + i, no_of_face);
        }
    }

    public static void main(String[] args) {
        int no_of_dice = 2; // Number of dice
        int no_of_face = 6; // Number of faces on each die
        int target = 7;     // Target sum
        
        RollingDice(no_of_dice, target, 0, 0, "", no_of_face);
    } */



    // count the no. of pair

    /* public static int RollingDice(int no_of_dice, int target, int currDice, int currSum, String ans, int no_of_face) {
        // Base case: If all dice are used
        int count = 0;
        if (currDice == no_of_dice) {
            // Check if the current sum matches the target
            if (currSum == target) {
                // System.out.println(ans);
                return 1;
            }
            return 0;
        }
        
        // Try all possible outcomes for the current die
        for (int i = 1; i <= no_of_face; i++) {
            count += RollingDice(no_of_dice, target, currDice + 1, currSum + i, ans + i, no_of_face);
        }
        return count;
    }

    public static void main(String[] args) {
        int no_of_dice = 2; // Number of dice
        int no_of_face = 6; // Number of faces on each die
        int target = 7;     // Target sum
        System.out.println(RollingDice(no_of_dice, target, 0, 0, "", no_of_face));
        
    } */



    /* public static void RollingDice(int no_of_dice, int target, int curr, String string, int no_of_face) {
        if(curr == target) {
            System.out.println(string);
            return;
        }
        if(no_of_dice == 0) {
            return ;
        }
        if(curr > target) {
            return;
        }
        for (int k = 1; k <= no_of_face; k++) {
            RollingDice(no_of_dice-1, target, curr+k, string+k, no_of_face);
        }
    }
    public static void main(String[] args) {
        int no_of_dice = 2; // Number of dice
        int no_of_face = 6; // Number of faces on each die
        int target = 7;     // Target sum
        // System.out.println(RollingDice(no_of_dice, target, 0, 0, "", no_of_face));
        RollingDice(no_of_dice, target, 0, "", no_of_face);
                
    } */

    public static int RollingDice(int no_of_dice, int target, int curr, String string, int no_of_face) {
        if(curr == target) {
            System.out.println(string);
            return 1;
        }
        if(no_of_dice == 0) {
            return 0;
        }
        if(curr > target) {
            return 0;
        }
        int count = 0;;
        for (int k = 1; k <= no_of_face; k++) {
           count +=  RollingDice(no_of_dice-1, target, curr+k, string+k, no_of_face);
        }
        return count;
    }
    public static void main(String[] args) {
        int no_of_dice = 3; // Number of dice
        int no_of_face = 6; // Number of faces on each die
        int target = 6;     // Target sum
        System.out.println(RollingDice(no_of_dice, target, 0, "", no_of_face));
    }
}
=======
package Leetcode.Recursion.Medium;

public class NumberDice_1155 {
    
    
   /*  public static void RollingDice(int no_of_dice, int target, int currDice, int currSum, String ans, int no_of_face) {
        // Base case: If all dice are used
        if (currDice == no_of_dice) {
            // Check if the current sum matches the target
            if (currSum == target) {
                System.out.println(ans);
            }
            return;
        }

        // Try all possible outcomes for the current die
        for (int i = 1; i <= no_of_face; i++) {
            RollingDice(no_of_dice, target, currDice + 1, currSum + i, ans + i, no_of_face);
        }
    }

    public static void main(String[] args) {
        int no_of_dice = 2; // Number of dice
        int no_of_face = 6; // Number of faces on each die
        int target = 7;     // Target sum
        
        RollingDice(no_of_dice, target, 0, 0, "", no_of_face);
    } */



    // count the no. of pair

    public static int RollingDice(int no_of_dice, int target, int currDice, int currSum, String ans, int no_of_face) {
        // Base case: If all dice are used
        int count = 0;
        if (currDice == no_of_dice) {
            // Check if the current sum matches the target
            if (currSum == target) {
                // System.out.println(ans);
                return 1;
            }
            return 0;
        }
        
        // Try all possible outcomes for the current die
        for (int i = 1; i <= no_of_face; i++) {
            count += RollingDice(no_of_dice, target, currDice + 1, currSum + i, ans + i, no_of_face);
        }
        return count;
    }

    public static void main(String[] args) {
        int no_of_dice = 2; // Number of dice
        int no_of_face = 6; // Number of faces on each die
        int target = 7;     // Target sum
        System.out.println(RollingDice(no_of_dice, target, 0, 0, "", no_of_face));
        
    }
}
>>>>>>> 918d1b89065d474af45ae17753718f3bfe1f7407
