import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        List<double[]> failureRates = new ArrayList<>();

        int level = 1;
        while (level <= N) {
            int challengerCnt = 0;
            int looserCnt = 0;
            for (int i = 0; i < stages.length; i++) {
                if (stages[i] >= level) challengerCnt++;
                if (stages[i] == level) looserCnt++;
            }
            
            double failureRatio = (challengerCnt > 0) ? (double) looserCnt / challengerCnt : 0.0;
            
            failureRates.add(new double[] {level, failureRatio});  
            level++;
            
        }
        
        failureRates.sort((a, b) -> Double.compare(b[1], a[1]) == 0 ? Double.compare(a[0], b[0]) : Double.compare(b[1], a[1]));
        
        
        for (int i = 0; i < N; i++) {
            answer[i] = (int) failureRates.get(i)[0];
        }
        
        return answer;
    }
}
