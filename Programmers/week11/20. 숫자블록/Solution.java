import java.util.*;

class Solution {
    public int[] solution(long begin, long end) {
        int b = (int) begin;
        int e = (int) end;

        int[] answer = new int[e - b + 1];

        for (int i = b; i <= e; i++) {
            if (i == 1) {
                answer[0] = 0; 
                continue;
            }

            answer[i - b] = 1; // 기본값 1
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    int divisor = i / j; 
                    if (divisor <= 10000000) {
                        answer[i - b] = divisor;
                        break;
                    } else { 
                        answer[i - b] = j;
                    }
                }
            }
        }

        return answer;
    }
}
