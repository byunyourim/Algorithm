import java.util.*;
class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        
        Arrays.sort(targets, (a, b) -> a[1] - b[1]);
        
        int aircraft = 0;
        
        for (int i = 0; i < targets.length; i++) {
            if (aircraft <= targets[i][0]) {
                aircraft = targets[i][1];
                answer++;
            }
        }
        return answer;
    }
}
