// https://school.programmers.co.kr/learn/courses/30/lessons/43238
import java.util.Arrays;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);
        long left = 1;
        long right = (long) times[times.length-1] * n;

        while (left <= right) {
            long mid = (left + right) / 2;

            long complete = 0;
            for (int i=0; i< times.length; i++) {
                complete += mid / times[i];
            }
            if (complete >= n) { // 처리한 사람이 더 많은 경
                right = mid - 1;
                answer = mid;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }
}
