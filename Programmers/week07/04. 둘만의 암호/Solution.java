import java.util.*;
class Solution {
    public String solution(String s, String skips, int index) {
        StringBuilder builder = new StringBuilder();
        String[] sArr = s.split("");
        String[] skipArr = skips.split("");
        for (String value : sArr) {
            int cnt = 0;
            int cVal = (int) value.charAt(0);
            
            int newVal = cVal + index;
            for (String skip : skipArr) {
                int skipVal = (int) skip.charAt(0);
                if ( skipVal >= cVal && skipVal <= newVal  ) {
                    newVal++;
                }
            }
            if (newVal > 122) {
                int interVal = newVal - 122;
                newVal = 96 + interVal;
            }   
            builder.append((char) newVal);
        }
        return builder.toString();
    }
}
