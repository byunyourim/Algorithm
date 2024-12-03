import java.util.*;
class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = {};
        
        // 배열 생성
        int value = 1;
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = value++;
            }
        }
        
        List<Integer> result = new ArrayList<>();
        for (int[] query : queries) {
            int startX = query[0]-1;
            int startY = query[1]-1;
            int endX = query[2]-1;
            int endY = query[3]-1;
            
            int min = rotate(matrix, startX, startY, endX, endY);
            result.add(min);
        }
        
        return result.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
    
    private int rotate(int[][] matrix, int x1, int y1, int x2, int y2) {
        int temp = matrix[x1][y1];
        int min = temp;

        // 좌측 열 : 위로 이동
        for (int i = x1; i < x2; i++) {
            matrix[i][y1] = matrix[i + 1][y1];
            min = Math.min(min, matrix[i][y1]);
        }
        
        // 아래 행 : 좌측 이동
        for (int i = y1; i < y2; i++) {
            matrix[x2][i] = matrix[x2][i + 1];
            min = Math.min(min, matrix[x2][i]);
        }
        
        // 우측 열 : 아래 쪽 이동
        for (int i = x2; i > x1; i--) {
            matrix[i][y2] = matrix[i - 1][y2];
            min = Math.min(min, matrix[i][y2]);
        }
        
        int temp2 = 0;
        // 위 행: 우측 이동 , 3, 2, 1
        for (int i = y2; i > y1; i--) {
            temp2 = matrix[x1][i - 1];
            matrix[x1][i] = matrix[x1][i - 1];
            min = Math.min(min, matrix[x1][i]);
        }
        matrix[x1][y1 + 1] = temp;
        return min;
    }
}
