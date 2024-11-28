import java.util.*;
class Solution {
    public String[] solution(String[] orders, int[] course) {
        List<String> courses = new ArrayList<>();
        
        for (int c : course) {
            Map<String, Integer> orderMap = new HashMap<>();
            
            for (String o : orders) {
                char[] el = o.toCharArray();
                Arrays.sort(el);
                combine(el, c, 0, new char[c], orderMap);
            }
        
            int maxCount = 2;
            for (int count : orderMap.values()) {
                maxCount = Math.max(maxCount, count);
            }

            for (Map.Entry<String, Integer> entry : orderMap.entrySet()) {
                if (entry.getValue() == maxCount) {
                    courses.add(entry.getKey());
                }
            }
        }
        Collections.sort(courses);
        return courses.toArray(new String[0]);
    }
    
    public void combine(char[] elements, int size, int startIndex, char[] current, Map<String, Integer> map) {
        
        if (size == 0) {
            String curStr = String.valueOf(current);
            map.put(curStr, map.getOrDefault(curStr, 0) + 1);
            return ;
        }
        
        for (int i = startIndex; i <= elements.length - size; i++) {
            current[current.length - size] = elements[i];
            combine(elements, size - 1, i + 1, current, map);
        }
    }
}
