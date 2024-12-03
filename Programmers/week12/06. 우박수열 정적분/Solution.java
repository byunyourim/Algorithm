import java.util.*;
class Solution {
    public double[] solution(int k, int[][] ranges) {
        
        List<Double> data= new ArrayList<>();
        Double total = 0.0; 
        data.add(total);
        
        while (k > 1) {
            int prev = k;
            if (k % 2 == 0) {
                k /= 2;
            } else if (k % 2 != 0) {
                k = k * 3 + 1;
            }
            total += (double) (prev + k) / 2;
            data.add(total);
        }
        
        double[] result = new double[ranges.length];
        
        for (int i = 0; i < ranges.length; i++) {
            int a = ranges[i][0];
            int b = data.size() - 1 + ranges[i][1];
            
            if (a > b || a < 0 || b >= data.size()) {
                result[i] = -1.0;
            } else {
                result[i] = data.get(b) - data.get(a);
            }
        }
        return result;
    }
}
