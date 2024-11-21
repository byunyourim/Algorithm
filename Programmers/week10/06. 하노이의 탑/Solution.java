import java.util.*;
class Solution {
    List<int[]> list = new ArrayList<>();
    public int[][] solution(int n) {
        
        move(n, 1, 2, 3);
        
        int[][] answer = list.stream()
            .toArray(int[][]::new);
        
        return answer;
    }
    
    public void move(int n, int start, int mid, int end) {
        if (n == 0) return;
        
        move (n - 1, start, end, mid);
        list.add(new int[]{start, end});
        move (n - 1, mid, start, end);
    }
}
