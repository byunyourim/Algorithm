import java.util.*;
class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int idx = 0;
        Integer[] loc = {0, 0};
        
        Set<String> roads = new HashSet<>();
        while (idx < dirs.length()) {
            String cmd = String.valueOf(dirs.charAt(idx));
            
            int x = loc[0];
            int y = loc[1];
            if (cmd.equals("U")) {
               y = loc[1] + 1;
            }
            if (cmd.equals("D")){
               y -= 1;
            }
            if (cmd.equals("R")) {
               x += 1;
            }
            if (cmd.equals("L")) {
               x -= 1;
            }
            
            if (x > 5 || x < -5 || y > 5 || y < -5) {
                idx++;
                continue;
            }
            
            String path1 = loc[0] + "," + loc[1] + "->" + x + "," + y;
            String path2 = x + "," + y + "->" + loc[0] + "," + loc[1];
            
            
            if (!roads.contains(path1) && !roads.contains(path2)) {
                roads.add(path1);
                roads.add(path2);
                answer++;
            }
            
            loc[0] = x;
            loc[1] = y;
            
            idx++;
        }
        return answer;
    }
}
