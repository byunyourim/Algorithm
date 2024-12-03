/*
https://school.programmers.co.kr/learn/courses/30/lessons/42842

1. extent = brown + yellow

2. 될 수 있는 조합 구하기, 가로가 세로보다 길다
*/
import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int total = brown + yellow;
        
        for (int h = 3; h <= Math.sqrt(total); h++) {
            if (total % h == 0) {  // 조건 추가 -> 불필요한 연산 제거
                int w = total / h;
            
                if (w >= h) {
                    if ((w-2) * (h-2) == yellow) {
                        answer[0] = Math.max(w, h);
                        answer[1] = Math.min(w, h);
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
