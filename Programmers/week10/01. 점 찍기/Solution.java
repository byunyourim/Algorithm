import java.util.*;
class Solution {
    public long solution(int k, int d) {
        long cnt = 0;
        for (long x = 0; x <= d; x+=k) {
            long maxY = (long) Math.sqrt((long) d * d - (long) x * x);
            
            cnt += maxY / k + 1;
        }
        return cnt;
    }
}
