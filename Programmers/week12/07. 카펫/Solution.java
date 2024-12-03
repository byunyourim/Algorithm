class Solution {
    public int[] solution(int brown, int yellow) {

        int[] answer = new int[2];

        int total = brown + yellow;
        int y = 0;
        int x = 0;
        for (int i = 3; i <= total; i++) {
            y = total / i;
            if (y >= i) {
                if ((i - 2) * (y - 2) == yellow) { // 4 * 6 = 24
                    answer[0] = Math.max(i, y);
                    answer[1] = Math.min(i, y);
                    break;
                }
            }
        }
        return answer;
    }
}
