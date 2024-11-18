import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {

        Queue<Integer> que1 = new LinkedList<>();
        Queue<Integer> que2 = new LinkedList<>();
        
        int len1 = queue1.length;
        int len2 = queue2.length;


        for (int queue : queue1) {
            que1.offer(queue);
        }
        
        for (int queue : queue2) {
            que2.offer(queue);
        }
        
        long qSum1 = Arrays.stream(queue1).asLongStream().sum();
        long qSum2 = Arrays.stream(queue2).asLongStream().sum();
        
        long total = qSum1 + qSum2;
        if (total % 2 != 0 ) return -1;
        
        long target = (long) total / 2;
        
        int cnt = 0;
        int maxOperation = queue1.length*3;
        while (cnt < maxOperation && qSum1 != target) {
            if (qSum1 > target) {
                int value = que1.poll();
                que2.offer(value);
                qSum1 -= value;
                
            } else {
                int value = que2.poll();
                que1.offer(value);
                qSum1 += value;
                
            }
            
            cnt++;
        }
        
        return qSum1 == target ? cnt : -1;
    }
}
