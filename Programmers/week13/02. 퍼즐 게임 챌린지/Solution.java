class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int left = 1; 
        int right = 100000;
        while (left < right) {
            int mid = (left + right) / 2;
            if (calculateTime(diffs, times, mid) <= limit) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }
    
    public long calculateTime(int[] diff, int[] times, int level) {
        long totalTime = 0;
        for (int i = 0; i < diff.length; i++) {
            if (diff[i] <= level) {
                totalTime += times[i];
            } else {
                int mistakes = diff[i] - level;
            totalTime += (long) mistakes * (times[i] + (i > 0 ? times[i - 1] : 0)) + times[i];
            }
        }
        return totalTime;
    }
}
