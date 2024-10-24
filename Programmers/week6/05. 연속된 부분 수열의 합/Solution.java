class Solution_연속된부분수열의합 {

    public int[] solution(int[] sequence, int k) {
        int[] result = new int[2];
        int start = 0, end = 0;
        int minLen = Integer.MAX_VALUE;
        int currentSum = sequence[0];

        while (end < sequence.length) {
            if (currentSum == k) {
                int len = end - start;
                if (len < minLen) {
                    minLen = len;
                    result[0] = start;
                    result[1] = end;
                }
                currentSum -= sequence[start];
                start++;
            } else if (currentSum < k) {
                end++;
                if (end < sequence.length) {
                    currentSum += sequence[end];
                }
            } else {
                currentSum -= sequence[start];
                start++;
            }
        }
        return result;
    }
}
