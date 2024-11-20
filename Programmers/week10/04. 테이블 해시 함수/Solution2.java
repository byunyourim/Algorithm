import java.util.*;
import java.util.stream.*;
/*
* 중복 제거 및 스트림을 변환
*/
class Solution2 {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        Arrays.sort(data, (a, b) -> {
            if (b[col - 1] == a[col - 1]) {
                return Integer.compare(b[0], a[0]);
            }
            return Integer.compare(a[col - 1], b[col - 1]);
        });
        
        return IntStream.range(row_begin-1, row_end)
            .map(i -> {
                int index = i + 1;
                return Arrays.stream(data[i])
                    .map(v -> v % index)
                    .sum();
            })
            .reduce(0, (acc, current) -> acc ^ current);
    }
}
