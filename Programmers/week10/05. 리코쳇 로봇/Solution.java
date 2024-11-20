import java.util.*;

class Solution {
    public int solution(String[] board) {
        int rows = board.length;
        int cols = board[0].length();
        int[] start = new int[2];
        int[] goal = new int[2];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i].charAt(j) == 'R') start = new int[] {i, j};
                if (board[i].charAt(j) == 'G') goal = new int[] {i, j};
            }
        }
        
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[rows][cols];
        queue.add(new int[] {start[0], start[1], 0}); // {x, y, 이동 횟수}
        visited[start[0]][start[1]] = true;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int moves = current[2];
            
            if (x == goal[0] && y == goal[1]) return moves;
            
            for (int[] dir : directions) {
                int nx = x;
                int ny = y;
                
                while (nx >= 0 && nx < rows && ny >= 0 && ny < cols && board[nx].charAt(ny) != 'D') {
                    nx += dir[0];
                    ny += dir[1];
                }
                
                nx -= dir[0];
                ny -= dir[1];
                
                if (!visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.add(new int[] {nx, ny, moves + 1});
                }
            }
        }
        
        return -1;
    }
}
