import java.util.*;
class Solution {
    public long solution(int w, int h) {
        long available = 0;
        for (long i = 0; i < w; i++) {
            available += Math.floor((double) h/w * i);
        }
        
        return available * 2;
    }
}
