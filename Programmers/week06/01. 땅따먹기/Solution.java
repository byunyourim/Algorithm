class Solution {

    int solution(int[][] land) {
        int xlen = land.length;
        int ylen = land[0].length;

        int[][] dp = new int[land[0].length][4];
        for (int x = 0; x < 4; x++) {
            dp[0][x] = land[0][x];
        }

        for (int y = 1; y < xlen; y++) {
            dp[y][0] = land[y][0] + Math.max(dp[y-1][1], Math.max(dp[y-1][2], dp[y-1][3]));
            dp[y][1] = land[y][1] + Math.max(dp[y-1][0], Math.max(dp[y-1][2], dp[y-1][3]));
            dp[y][2] = land[y][2] + Math.max(dp[y-1][0], Math.max(dp[y-1][1], dp[y-1][3]));
            dp[y][3] = land[y][3] + Math.max(dp[y-1][0], Math.max(dp[y-1][1], dp[y-1][2]));
        }
        return Math.max(dp[xlen-1][0], Math.max(dp[xlen-1][1], Math.max(dp[xlen-1][2], dp[xlen-1][3])));
    }
}
