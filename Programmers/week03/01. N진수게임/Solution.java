class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();
        StringBuilder totalSequence = new StringBuilder();

        int num = 0;
        while (totalSequence.length() < m * t ) {
            totalSequence.append(Integer.toString(num++, n).toUpperCase());
        }

        for (int i = 0; i < t; i++) {
            answer.append(totalSequence.charAt((p - 1) + i * m));
        }

        System.out.println(totalSequence.charAt(1));

        return answer.toString();
    }
}
