package Leetcode.AllQuestion;

public class AddBinary_67 {

  public static String addBinary(String a, String b) {
    StringBuilder ans = new StringBuilder();

    int i = a.length() - 1;
    int j = b.length() - 1;
    int carry = 0;

    while (i >= 0 || j >= 0 || carry != 0) {
      int aBit = (i >= 0) ? a.charAt(i) - '0' : 0;
      int bBit = (j >= 0) ? b.charAt(j) - '0' : 0;

      int sum = aBit + bBit + carry;
      ans.insert(0, sum % 2); // only 0 or 1
      carry = sum / 2;

      i--;
      j--;
    }

    return ans.toString();
  }

  public static void main(String[] args) {
    // String a = "1010", b = "1011";
    String a = "11", b = "1";
    System.out.println(addBinary(a, b));
  }
}
