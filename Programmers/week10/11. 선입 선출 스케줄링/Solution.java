import java.util.*;
class Solution {
    public int solution(int n, int[] cores) {
        int answer = 0;
        
        int coreNum = cores.length;
        
        if (n <= coreNum) {
            return n;
        }
        
        int left = 0; 
        int right= Arrays.stream(cores).max().getAsInt() * n;
        int time = 0;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            int totalTask = 0; // mid 까지 처리 가능한 작업 수
            
            for (int core : cores) {
                totalTask += mid / core + 1;
            }
            
            
            if (totalTask >= n) {
                time = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        int tasksProcessed = 0;
        for (int core : cores) {
            tasksProcessed += (time - 1) / core + 1;
        }
        
        int remainTask = n - tasksProcessed;
        for (int i = 0; i < coreNum; i++) {
            if (time % cores[i] == 0) { 
                remainTask--;
                if (remainTask == 0) {
                    return i + 1; 
                }
            }
        }
        
        return -1;
    }
}
