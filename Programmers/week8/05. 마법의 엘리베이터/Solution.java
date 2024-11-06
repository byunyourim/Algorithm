class Solution {
    public int solution(int storey) {
        int magicStoneCount = 0;
        
        while (storey > 0) {
            int remainder = storey % 10;  
            storey /= 10;
            
            if (remainder < 5) {
                magicStoneCount += remainder;
                
            } else if (remainder > 5){  
                magicStoneCount += (10 - remainder);
                storey++; 
            } else {
                if (storey % 10 >= 5) {
                    magicStoneCount += (10 - remainder);
                    storey++; 
                } else {
                    magicStoneCount += remainder;
                }
            }
        }

        return magicStoneCount;
    }
}
