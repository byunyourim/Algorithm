class Solution {
    public int[] solution(int target) {
        int[][] dp = new int[target + 1][2];
        for (int i = 1; i <= target; i++) {
            dp[i][0] = Integer.MAX_VALUE;
        }
        
        for (int score = 1; score <= 20; score++) {
            for (int m = 1; m <= 3; m++) {
                int point = score * m;
                
                if (point > target) break;
                
                for (int i = point; i <= target; i++) {
                    if (dp[i-point][0] + 1 < dp[i][0]) {
                        dp[i][0] = dp[i-point][0] + 1;
                        dp[i][1] = dp[i-point][1] + (m == 1 ? 1 : 0);
                    } else if (dp[i - point][0] + 1 == dp[i][0]) {
                        dp[i][1] = Math.max(dp[i][1], dp[i-point][1] + (m == 1 ? 1 : 0));
                    }
                }
            }
        }
        
        for (int i = 50; i <= target; i++) {
            if (dp[i - 50][0] + 1 < dp[i][0]) {
                dp[i][0] = dp[i - 50][0] + 1;
                dp[i][1] = dp[i - 50][1] + 1;
            } else if (dp[i - 50][0] + 1 == dp[i][0]) {
                dp[i][1] = Math.max(dp[i][1], dp[i - 50][1] + 1);
            }
        }

        return dp[target];
    }
}
