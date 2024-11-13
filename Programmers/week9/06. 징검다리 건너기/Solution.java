import java.util.*;
class Solution {
    public int solution(int[] stones, int k) {
        int num = 0;
        
        while (true) {
            int jump = 0;
            int maxJump = 0;
            boolean canCross= true;
            
            for (int i = 0; i < stones.length; i++) {
                if (stones[i] > 0) {
                    stones[i] -= 1;
                    canCross = true;
                    jump = 0;
                    continue;
                } 
                
                if (stones[i] == 0) {
                    jump++;
                    canCross = false;
                }
                maxJump = Math.max(jump, maxJump);
                
            }
            if (maxJump >= k) break;
            
            num++;
        }
        return num++;
    }
}
