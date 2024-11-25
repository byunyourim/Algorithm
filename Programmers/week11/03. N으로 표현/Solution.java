import java.util.HashSet;
import java.util.Set;
class Solution {
    public int solution(int N, int number) {
        if (N == number) return 1;

        Set<Integer>[] dp = new HashSet[9];
        for (int i=1; i<=8; i++) {
            dp[i] = new HashSet<>();
        }

        dp[1].add(N);

        for (int i=2; i<=8; i++) {
            for (int j=1; j<i; j++) {
                for(int x: dp[j]) {
                    for (int y: dp[i-j]) {
                        dp[i].add(x+y);
                        dp[i].add(x-y);
                        dp[i].add(x*y);
                        if (y!=0) {
                            dp[i].add(x/y);
                        }
                    }
                }
            }
            dp[i].add(Integer.parseInt(Integer.toString(N).repeat(i)));

            if (dp[i].contains(number)) {
                return i;
            }
        }

        return -1;
    }
}
