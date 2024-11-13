import java.util.*;
class Solution
{
    public int solution(int [][]board)
    {
        int rows = board.length;
        int cols = board[0].length;
        
        int[][] dp = new int[rows][cols];
        int max = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = board[i][j];
                } else {
                    if (board[i][j] == 1) {
                       dp[i][j] = Math.min(Math.min(dp[i-1][j-1], dp[i-1][j]), dp[i][j-1]) + 1;
                    }
                }
                
                
                max = Math.max(dp[i][j], max);
            }
        }
        
        return max*max;
    }
}
