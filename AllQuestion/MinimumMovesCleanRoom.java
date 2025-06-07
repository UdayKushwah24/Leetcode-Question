package Leetcode.AllQuestion;

public class MinimumMovesCleanRoom {
   
    static int ans = 0;
    private static void ClearRoom(char[][] room, int x, int y,int ce, int energy) {
        if (x < 0 || y < 0 || x >= room.length || y >= room[0].length || room[x][y] == 'X') {
            return ;
        }

        char current = room[x][y];

        if (current == 'L') {
            ans+=1;
            ce += 1;
        } else if (room[x][y] == 'R') {
            ce = energy;
        } else if (current != 'S') {
            ce -= 1;
        }
        if (ce < 0) {
            return;
        }
        int i[] = {0, 1, 0, -1};
        int j[] = {1, 0, -1, 0};
        room[x][y] = 'X';
            
        
        for (int k = 0; k < j.length; k++) {
            ClearRoom(room, x+i[k], y+j[k], ce, energy);
        }   
        // room[]    

    }

    public static void main(String[] args) {
        String[] classroom = { "S.", "XL" };
        int energy = 2;
        char[][] room = new char[classroom.length][classroom[0].length()];
        int x = 0, y = 0;
        for (int i = 0; i < room.length; i++) {
            String move = classroom[i];
            for (int j = 0; j < move.length(); j++) {
                room[i][j] = move.charAt(j);
                if (move.charAt(j) == 'S') {
                    x = i;
                    y = j;
                }

            }
        }
        ans =0;
        ClearRoom(room, x, y, 0, energy);
        System.out.println(ans);
    }

}
