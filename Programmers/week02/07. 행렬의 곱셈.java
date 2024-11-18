// https://school.programmers.co.kr/learn/courses/30/lessons/12949
class Solution_행렬의곱셈 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rowLen1 = arr1.length;
        int colLen1 = arr1[0].length;
        int colLen2 = arr2[0].length;

        int[][] answer = new int[rowLen1][colLen2];

        for (int i = 0; i < rowLen1; i++) {
            for (int j = 0; j < colLen2; j++) {
                for (int k = 0; k < colLen1; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return answer;
    }
}
