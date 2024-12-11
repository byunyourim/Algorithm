class Solution {
    public int solution(int n, long l, long r) {
        int count = 0;
        for (long i = l; i <= r; i++) {
            if (isOne(n, i)) {
                count++;
            }
        }
        
        return count;
    }
    
    public static boolean isOne(int n, long index) {
        if (n == 0) return true;
        
        long length = (long) Math.pow(5, n - 1);
        long segment = (index - 1) / length;
        
        if (segment == 2) {
            return false;
        }
        
        return isOne(n - 1, (index - 1) % length + 1);
    }
}
