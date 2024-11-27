import java.util.*;
class Solution {
    public long solution(int w, int h) {
        long gcd = gcd(w, h); // 최대공약수 계산
        return (long)w * h - (w + h - gcd);
    }
    
    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
