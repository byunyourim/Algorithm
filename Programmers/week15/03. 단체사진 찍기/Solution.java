import java.util.*;
class Solution {
    static String[] members = {"A", "C", "F", "J", "M", "N", "R", "T"};
    static boolean[] visited = new boolean[members.length];
    static int count = 0;
    public int solution(int n, String[] data) {
        count = 0; 
        permute(new ArrayList(), data);

        return count;
    }
    
    public static void permute(List<String> arrangement, String[] conditions) {
        if (arrangement.size() == members.length) {
            if (isValid(arrangement, conditions)) {
                count++;
            }
            return;
        }

        for (int i = 0; i < members.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arrangement.add(members[i]);
                permute(arrangement, conditions);
                arrangement.remove(arrangement.size() - 1);
                visited[i] = false;
            }
        }
    }
    
    public static boolean isValid(List<String> arrangement, 
                                  String[] conditions) {
        for (String condition : conditions) {
            char p1 = condition.charAt(0);
            char p2 = condition.charAt(2);
            char operator = condition.charAt(3);
            int value = condition.charAt(4) - '0';

            int pos1 = arrangement.indexOf(String.valueOf(p1));
            int pos2 = arrangement.indexOf(String.valueOf(p2));

            int distance = Math.abs(pos1 - pos2) - 1;

            if (operator == '=' && distance != value) {
                return false;
            } else if (operator == '<' && distance >= value) {
                return false;
            } else if (operator == '>' && distance <= value) {
                return false;
            }
        }
        return true;
    }
}




