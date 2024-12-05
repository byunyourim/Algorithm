class Solution {
    int maxDiff = 0;
    int[] bestRyan;

    public int[] solution(int n, int[] info) {
        bestRyan = new int[11];
        dfs(n, 0, new int[11], info);
        return maxDiff > 0 ? bestRyan : new int[]{-1};
    }

    private void dfs(int arrowsLeft, int index, int[] ryan, int[] apeach) {
        if (index == 11) {
            ryan[10] += arrowsLeft;

            int ryanScore = 0, apeachScore = 0;
            for (int i = 0; i < 11; i++) {
                if (ryan[i] > apeach[i]) {
                    ryanScore += 10 - i;
                } else if (apeach[i] > 0) {
                    apeachScore += 10 - i;
                }
            }

            if (ryanScore > apeachScore) {
                int diff = ryanScore - apeachScore;
                if (diff > maxDiff || (diff == maxDiff && isBetterAnswer(ryan))) {
                    maxDiff = diff;
                    bestRyan = ryan.clone();
                }
            }

            ryan[10] -= arrowsLeft;
            return;
        }

        if (arrowsLeft > apeach[index]) {
            ryan[index] = apeach[index] + 1; 
            dfs(arrowsLeft - ryan[index], index + 1, ryan, apeach);
            ryan[index] = 0;
        }

        dfs(arrowsLeft, index + 1, ryan, apeach);
    }

    private boolean isBetterAnswer(int[] candidate) {
        for (int i = 10; i >= 0; i--) {
            if (candidate[i] > bestRyan[i]) {
                return true;
            } else if (candidate[i] < bestRyan[i]) {
                return false;
            }
        }
        return false;
    }
}
