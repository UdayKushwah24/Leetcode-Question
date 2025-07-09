package Leetcode.LogicalQuestion;

public class CountOperationsZero_2169 {
    public static int countOperations(int num1, int num2) {
        int operation = 0;
        while (num1 != 0 && num2 != 0) {
            if (num1 >= num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
            operation += 1;
        }
        return operation;
    }
    public static void main(String[] args) {
        int num1 = 5, num2 = 4;
        System.out.println(countOperations(num1, num2));
    }
}
