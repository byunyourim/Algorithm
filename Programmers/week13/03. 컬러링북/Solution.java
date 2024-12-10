import java.util.*;
class Solution {
    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};
    static boolean[][] visited;
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        
        visited = new boolean[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (picture[i][j] != 0 && !visited[i][j]) {
                    numberOfArea++;
                    int size = bfs(i, j, picture, m, n);
                    maxSizeOfOneArea = Math.max(maxSizeOfOneArea, size);
                }
            }
        }
        return new int[] {numberOfArea, maxSizeOfOneArea};
    }
    
    public static int bfs(int y, int x, int[][] picture, int m, int n) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {y, x});
        visited[y][x] = true;
        
        int color = picture[y][x];
        int size = 1;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            for (int i = 0; i < 4; i++) {
                int my = current[0] + dy[i];
                int mx = current[1] + dx[i];
                
                if (mx >= 0 && mx < n && my >= 0 && my < m &&
                    !visited[my][mx] && picture[my][mx] == color) {
                    queue.add(new int[] {my, mx});
                    visited[my][mx] = true;
                    size++;
                }
            }
        }
        return size;
    }
}
