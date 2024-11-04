// 시간 초과
class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for (int idx = 0; idx < numbers.length; idx++) {
            long number = numbers[idx];

            long newNum = number + 1;
            
            while (Long.bitCount(newNum) != Long.bitCount(number)) {
                int diffBits = Long.bitCount(newNum ^ number);

                if (diffBits <= 2) {
                    break;
                }
                newNum++;
            }
            answer[idx] = newNum;
            
            
            
        }
        return answer;
    }
}
