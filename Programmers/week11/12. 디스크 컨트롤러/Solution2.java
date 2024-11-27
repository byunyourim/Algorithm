import java.util.*;
/* 디스크 컨트롤러
1. 작업의 요청 시점 정렬
2. 작업의 소요 시간 순을 정렬
3. currentTime 현재 시간, 대기 중인 가장 짧은 소요시간을 가진 작업 처리
4. 처리 후 대기 시간 누적
5. 큐가 빈 경우 다음 작업이 도착할 때까지 대기, currentTime
6. 모든 작업 처리 후 요청 시점으로 정렬
*/
class Solution {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> 
                                                      a[1] - b[1]);
        
        int currentTime = 0;
        int totalWaitTime = 0;
        int index = 0;
        int n = jobs.length;    // 작업의 갯수
        int jobCount = 0;
        
        while (jobCount < n) {
            while (index < n && jobs[index][0] <= currentTime) {
                pq.offer(jobs[index]);
                index++;
            }
            
            if (!pq.isEmpty()) {
                int[] job = pq.poll();
                currentTime += job[1];
                totalWaitTime += currentTime - job[0];
                jobCount++;
            } else {
                currentTime = jobs[index][0];
            }
        }
        return totalWaitTime / n;
    }
}
