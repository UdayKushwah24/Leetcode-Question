package Leetcode.Stack;

import java.util.Stack;

public class MaximalSquare_221 {
     public static int Area(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
				int h = arr[st.pop()];
				int r = i;
                int l = st.peek();
				if (!st.isEmpty() ) {
                    if((h == (r - l - 1)))
                    ans = Math.max(ans, h * (r - l - 1));
				} else  {
                    if(h == r)
                    ans = Math.max(ans, h * r);
				}
			}

			st.push(i);
		}
		int r = arr.length;
		while (!st.isEmpty()) {
			int h = arr[st.pop()];
				// int r = i;
                int l = st.peek();
				if (!st.isEmpty() ) {
                    if((h == (r - l - 1)))
                    ans = Math.max(ans, h * (r - l - 1));
				} else  {
                    if(h == r)
                    ans = Math.max(ans, h * r);
				}
		}
		return ans;
	}
    public static void main(String[] args) {
        char[][] matrix = { { '1', '0', '1', '0', '0' }, 
                            { '1', '0', '1', '1', '1' }, 
                            { '1', '1', '1', '1', '1' },
				            { '1', '0', '0', '1', '0' } };
		int[] arr = new int[matrix[0].length];
		int ans = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == '0') {
                    arr[j] = 0;
                } else {
                    arr[j]++;
                }
            }
            ans = Math.max(ans, Area(arr));
        }
        System.out.println(ans);
    }
}
