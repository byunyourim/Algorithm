class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n*(n+1))/2];
        int[][] dalpaeng = new int[n][n];
        int x = -1;
        int y = 0;
        int num = 1;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                if (i % 3 == 0) {
                    x++;
                } else if (i % 3 == 1) {
                    y++;
                } else if (i % 3 == 2) {
                    x--;
                    y--;
                }
                dalpaeng[x][y] = num;
                num++;
            }
        }
        
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (dalpaeng[i][j] == 0) break;
                answer[k++] = dalpaeng[i][j];
            }
        }
        
        return answer;
    }
}
