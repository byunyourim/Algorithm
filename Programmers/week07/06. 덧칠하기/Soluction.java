import java.util.*;
class Solution {
    public int solution(int n, int m, int[] sections) {
        int cnt = 0; 
        int i = 0; 

        while (i < sections.length) { 
            cnt++; 
            int rangeEnd = sections[i] + m;
            
            while (i < sections.length && sections[i] < rangeEnd) {
                i++;
            }
        }
        
        return cnt;
    }
}
