import java.util.*;

class Solution {
    public int[] solution(int n, int[][] roads, int[] sources, int destination) {
        
        List<List<Integer>> graph = new ArrayList<>();
        
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int[] road : roads) {
            int a = road[0];
            int b = road[1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        
        int[] distance = new int[n+1]; // 최단 거리 계산
        Arrays.fill(distance, -1);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(destination);
        distance[destination] = 0;
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            int currentDistance = distance[current];
            
            for (int neighbor : graph.get(current)) {
                if (distance[neighbor] == -1) {
                    distance[neighbor] = currentDistance +1;
                    queue.add(neighbor);
                }
            }
        }
        
        int[] result = new int[sources.length];
        for (int i = 0; i < sources.length; i++) {
            result[i] = distance[sources[i]];
        }
        return result;
        
    }
}
