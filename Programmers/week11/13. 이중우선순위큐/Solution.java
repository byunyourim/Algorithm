import java.util.*;
/*
1. 명령 확인 (I, D)
2. 데이터 추가
3. 최댓값, 최솟값 삭제
*/
class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> min = new PriorityQueue<>();  // 오름차순
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());  // 내림차순
        
        for (String o : operations) {
            String ops = o.split(" ")[0];
            int value = Integer.parseInt(o.split(" ")[1]);
            if (ops.equals("I")) {
                max.add(value);
                min.add(value);
            } else if (ops.equals("D")) {
                if (max.isEmpty()) continue;
                if (value == 1) {
                    int remove = max.poll();
                    min.remove(remove);
                } else if (value == -1){
                    int remove = min.poll();
                    max.remove(remove);
                }
            }
        }
        
        return max.isEmpty() ? new int[] {0, 0} 
                : new int[] {max.poll(), min.poll()};
    }
}
