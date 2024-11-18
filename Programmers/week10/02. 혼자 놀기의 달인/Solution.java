import java.util.*;
class Solution {
    public int solution(int[] cards) {
        int len = cards.length;
        boolean[] visited = new boolean[len];
        List<Integer> groupSizes = new ArrayList<>();
        
        for (int i = 0; i < len; i++) {
            if (!visited[i]) {
                int size = findGroupSize(visited, cards, i);
                groupSizes.add(size);
            }
        }
        
        groupSizes.sort(Collections.reverseOrder());
        
        if (groupSizes.size() < 2) {
            return 0;
        }
        
        return groupSizes.get(0) * groupSizes.get(1);
    }
    
    public int findGroupSize(boolean[] visited, int[] cards, int start) {
        int count = 0;
        int current = start;
        
        while (!visited[current]) {
            visited[current] = true;
            count++;
            current = cards[current]-1;
        }
        return count;
    }
}
