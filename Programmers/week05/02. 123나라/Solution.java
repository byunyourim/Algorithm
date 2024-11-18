class Solution{
    public String solution(int n) {

        StringBuilder answer = new StringBuilder();

        while(n > 0) {
            int remainder = n % 3;

            if (remainder == 0) {
                answer.append(4);
                n = (n / 3) - 1;
            } else {
                answer.append(remainder);
                n = (n / 3);
            }
        }

        return answer.reverse().toString();
    }
}
