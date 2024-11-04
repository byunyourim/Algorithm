// 시간초과 발생
class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for (int idx = 0; idx < numbers.length; idx++) {
            long number = numbers[idx];
            String numBinary = Long.toBinaryString(number);
            int length = numBinary.length();
            
            long newNum = number;
            while (newNum >= number) {
                newNum++;
                String newBinary = Long.toBinaryString(newNum);
                
                String formattedNumBinary = String.format("%" + length + "0s", numBinary);
                String formattedNewBinary = String.format("%" + length + "0s", newBinary);

                
                int diffCnt = 0;
                for (int i = 0; i < formattedNumBinary.length(); i++) {
                    if (formattedNumBinary.charAt(i) != formattedNewBinary.charAt(i)) {
                        diffCnt++;
                    }
                }
                
                if (diffCnt <= 2) {
                    answer[idx] = newNum;
                    break;
                }
            }
        }
        return answer;
    }
}
