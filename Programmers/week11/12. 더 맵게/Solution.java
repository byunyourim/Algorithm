// https://school.programmers.co.kr/learn/courses/30/lessons/42626
/*
1. scoville 정렬
2. 스코빌 지수 < k => 새로운 스코빌 지수 구하고 배열에 넣는다. 
3. 모든 스코빌 지수 >= K이면 종료 
4. 횟수 리턴
5. 위의 과정 반복
*/
import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int count = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int s : scoville) {
            queue.add(s);
        }
        
        while (queue.peek() < K) {
            if (queue.size() < 2) return -1;
            
            int cur = queue.poll();
            int next = queue.poll();
            int newScoville = cur + (next * 2);
            queue.add(newScoville);
            count++;
        }
        
        return count;
    }
}
