package Leetcode.LogicalQuestion;

public class CountSqSumTriplets_1925 {
    public static int countTriples(int n) {
        int c = 0;


        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                for (int k = i; k <= n; k++) {
                    if (i * i + j * j == k * k) {
                        System.out.println(i+" " + j+" "+ k);
                        c += 1;
                    }
                    if (i*i == j*j + k*k) {
                        System.out.println(j+" " + k+" "+ i);
                        c += 1;
                    }
                    if (i*i + k * k == j*j) {
                        System.out.println(i+" " + k+" "+ j);
                        c += 1;
                    }
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(countTriples(n));
    }
}
