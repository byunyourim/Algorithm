import java.util.*;

class Solution {
    public String solution(String s, String skips, int index) {
        StringBuilder builder = new StringBuilder();
        Set<Character> skipSet = new HashSet<>(); 

        for (char skip : skips.toCharArray()) {
            skipSet.add(skip);
        }

        for (char c : s.toCharArray()) {
            int newVal = c;
            
            for (int i = 0; i < index; ) {
                newVal++; 

                if (newVal > 'z') {
                    newVal = 'a';
                }
                if (!skipSet.contains((char) newVal)) {
                    i++; 
                }
            }
            builder.append((char) newVal);
        }

        return builder.toString(); 
    }
}
