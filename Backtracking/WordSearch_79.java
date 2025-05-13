<<<<<<< HEAD
package Leetcode.Backtracking;


public class WordSearch_79 {

    public static boolean SearchWord(char[][] board, String word, int cr, int cc, int idx) {
        if(word.length() == idx) {
            return true;
        }
        if (cr < 0 || cc < 0 || cr >= board.length || cc >= board[0].length || word.charAt(idx) != board[cr][cc]) {
            return false;
        }
        board[cr][cc] = '*';
        int[] row = {-1, 0, 1, 0};
        int[] col = { 0,-1, 0, 1};
        for (int i = 0; i < col.length; i++) {
            boolean ans = SearchWord(board, word, cr+row[i], cc+col[i],idx+1);
            if(ans == true) {
                return true;
            }
        }
        board[cr][cc] = word.charAt(idx);
        return false;
    }         
    public static void main(String[] args) {
        char[][] Board = { {'A','B','C','E'}, 
                           {'S','F','C','S'}, 
                           {'A','D','E','E'} };
        String word = "ABCCED";
        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board[0].length; j++) {
                if(Board[i][j] == word.charAt(0)) {
                    boolean ans = SearchWord(Board, word, i, j,0);
                    if(ans == true) {
                        System.out.println(ans);
                        return;
                    }
                }
            }
        }
        System.out.println(false);
    }


    /* 
    
    // Search word in a board.
    static boolean IsFound = false;
    public static void Search(char[][] board, String word, int cr, int cc, int idx) {

        if(idx == word.length()) {
            IsFound = true;
            return ;
        }
        if(cr < 0 || cc < 0 || cr >= board.length || cc >= board[0].length || board[cr][cc] != word.charAt(idx)) {
            return ;
        }
        board[cr][cc] = '*';
        int[] r = {0,1,0,-1};       
        int[] c = {1,0,-1,0}; 
        for (int k = 0; k < r.length; k++) {
            Search(board, word, cr+r[k], cc+c[k], idx+1);
        } 
        board[cr][cc] = word.charAt(idx);
        
    }
    public static void main(String[] args) {
        char[][] Board = { {'A','B','C','E'}, 
                           {'S','F','C','S'}, 
                           {'A','D','E','E'} };
        String word = "ABCED";
        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board.length; j++) {
                if(Board[i][j] == word.charAt(i)) {
                    Search(Board,word,i,j,0);
                }
            }
        }
        System.out.println(IsFound);
    }
    
     */
}
=======
package Leetcode.Backtracking;


public class WordSearch_79 {

    public static boolean SearchWord(char[][] board, String word, int cr, int cc, int idx) {
        if(word.length() == idx) {
            return true;
        }
        if (cr < 0 || cc < 0 || cr >= board.length || cc >= board[0].length || word.charAt(idx) != board[cr][cc]) {
            return false;
        }
        board[cr][cc] = '*';
        int[] row = {-1, 0, 1, 0};
        int[] col = { 0,-1, 0, 1};
        for (int i = 0; i < col.length; i++) {
            boolean ans = SearchWord(board, word, cr+row[i], cc+col[i],idx+1);
            if(ans == true) {
                return true;
            }
        }
        board[cr][cc] = word.charAt(idx);
        return false;
    }         
    public static void main(String[] args) {
        char[][] Board = { {'A','B','C','E'}, 
                           {'S','F','C','S'}, 
                           {'A','D','E','E'} };
        String word = "ABCCED";
        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board[0].length; j++) {
                if(Board[i][j] == word.charAt(0)) {
                    boolean ans = SearchWord(Board, word, i, j,0);
                    if(ans == true) {
                        System.out.println(ans);
                        return;
                    }
                }
            }
        }
        System.out.println(false);
    }
}
>>>>>>> 918d1b89065d474af45ae17753718f3bfe1f7407
