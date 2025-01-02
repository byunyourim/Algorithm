// https://school.programmers.co.kr/learn/courses/30/lessons/86052
import java.util.*;
/**
빛이 이동할 수 있는 경로 사이클 개수, 각 사이클의 길이
*/
class Solution {
    static boolean[][][] visited;
    static int row, col;
    static int[] dx = {-1, 0, 1, 0}; //아래-왼-위-오른
    static int[] dy = {0, -1, 0, 1};
    
    public int[] solution(String[] grid) {
        List<Integer> answer = new ArrayList<>();
        row = grid.length;
        col = grid[0].length();
        visited = new boolean[row][col][4];
        
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                for(int d=0;d<4;d++) {
                    if(!visited[i][j][d]) {
                        answer.add(pathOfLight(grid, i, j, d));
                    }
                }
            }
        }
        return answer.stream().sorted().mapToInt(i -> i).toArray();
    }
    
    public int pathOfLight(String[] grid, int i, int j, int d) {
        int count = 0;
        
        while (!visited[i][j][d]) {
            count++;
            visited[i][j][d] = true;
            
            if (grid[i].charAt(j) == 'L') {
                d = (d + 3) % 4;
            }
            if (grid[i].charAt(j) == 'R') {
                d = (d + 1) % 4;
            }
            
            i = (i + dx[d] + row) % row;
            j = (j + dy[d] + col) % col;
        
        }
        return count;
    }
}
