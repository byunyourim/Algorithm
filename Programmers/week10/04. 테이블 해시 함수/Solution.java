import java.util.*;
class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        
        Arrays.sort(data, (a, b) -> {
            if (b[col - 1] == a[col - 1]) {
                return Integer.compare(b[0], a[0]);
            }
            return Integer.compare(a[col - 1], b[col - 1]);
        });
        
        
        List<Integer> dataList = new ArrayList<>();
        for (int i = row_begin-1; i < row_end; i++) {
            int index = i + 1;
            int remain = 0;
            for (int j = 0; j < data[0].length; j++) {
                remain += data[i][j] % index;
            }
            dataList.add(remain);
        }
        
        for (Integer n : dataList) {
            answer ^= n;
        }
        
        return answer;
    }
}
