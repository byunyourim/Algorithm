import java.util.*;

class Solution {
    public int solution(int n, int[][] vertex) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : vertex) {
            int a = edge[0];
            int b = edge[1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        Queue<Integer> queue = new LinkedList<>();
        int[] distance = new int[n + 1];
        Arrays.fill(distance, -1);

        queue.add(1);
        distance[1] = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            int currentDistance = distance[current];

            for (int neighbor : graph.get(current)) {
                if (distance[neighbor] == -1) { // 아직 방문하지 않은 노드
                    distance[neighbor] = currentDistance + 1;
                    queue.add(neighbor);
                }
            }
        }

        // 가장 먼 노드의 거리 찾기
        int maxDistance = 0;
        for (int i = 1; i <= n; i++) {
            if (distance[i] > maxDistance) {
                maxDistance = distance[i];
            }
        }

        // 가장 먼 노드의 개수 세기
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (distance[i] == maxDistance) {
                count++;
            }
        }
        return count;
    }
}
