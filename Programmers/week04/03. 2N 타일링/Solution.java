class Solution {
  public int solution(int n) {
      int answer = 0;
      if (n == 1) return 1;
      if (n == 2) return 2;
      int[] dp = new int[n + 1];
      dp[1] = 1;
      dp[2] = 2;

      for (int i = 3; i <= n; i++) {
          int num = dp[i - 1]  + dp[i - 2];
          dp[i] = num % 1000000007;
      }

      return dp[n];
  }
}
