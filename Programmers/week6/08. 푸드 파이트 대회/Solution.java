class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            int n = 0;
            if (food[i] % 2 == 0  ) {
                n = food[i] / 2;
            } else if (food[i] % 2 != 0 & food[i] > 1) {
                n = (food[i] - 1) / 2;
            } else if (food[i] == 1) continue;
            
            int index = 0;
            
            while (index < n) {
                result.append(i);
                index++;
            }
        }
        String reverseStr = new StringBuilder(result).reverse().toString();
        result.append(0).append(reverseStr);
        
        return result.toString();
    }

    public String refactoring(int[] food) {
        
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            int n = food[i] / 2;
            result.append(i).repeat(n);

        }
    
        String reverseStr = new StringBuilder(result).reverse().toString();
        result.append(0).append(reverseStr);
        
        
        return result.toString();

        
    }
}
