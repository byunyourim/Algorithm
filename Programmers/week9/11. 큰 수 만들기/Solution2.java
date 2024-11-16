import java.util.*;
class Solution {
    public String solution(String number, int k) {
        StringBuilder builder = new StringBuilder();
        int remaining = number.length() - k;
        int idx = 0;
        
        for (int i = 0; i < remaining; i++) {
            char max = 0;
            
            for (int j = idx; j <= i + k; j++) {
                if (max < number.charAt(j)) {
                    max = number.charAt(j);
                    idx = j + 1;
                }
            }
            
            builder.append(max);
        }
        return builder.toString();
    }
}
