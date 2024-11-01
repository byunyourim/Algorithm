import java.util.*;
class Solution {
    public int[] solution(String msg) {
        int[] answer = {};
        
        Map<String, Integer> dictionary = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            char word = (char) (65 + i);
            dictionary.put(String.valueOf(word), i + 1);
        }
        
        int index = 0;
        ArrayList<Integer> result = new ArrayList<>();
        while (index < msg.length() - 1) {
            String cur = "";
            String pre = String.valueOf(msg.charAt(index));
            for (int i = 1; i <= msg.length() - index; i++) {
                
                cur = msg.substring(index, index + i);
                
                if (!dictionary.containsKey(cur)) {
                    dictionary.put(cur, dictionary.size() + 1);
                    break;
                }   
                pre = cur;
                
            }
            result.add(dictionary.get(pre)); 
            index = index + pre.length();
        }
        
        if (index == msg.length() - 1) {
            result.add(dictionary.get(String.valueOf(msg.charAt(index))));
        }
        
        
        
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}
