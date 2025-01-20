package boj.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Boj18352 {
    static List<List<Integer>> graph = new ArrayList<>();
    static int[] dist;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   // 도시 개수
        int m = Integer.parseInt(st.nextToken());   // 도로 개수
        int k = Integer.parseInt(st.nextToken());   // 거리
        int x = Integer.parseInt(st.nextToken());   // 출발 도시

        dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
        }

        dist[x] = 0;

        dijkstra(x);

        boolean found = false;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == k) {
                System.out.println(i);
                found = true;
            }
        }

        if (!found) {
            System.out.println(-1);
        }
    }

    private static void dijkstra(int x) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        queue.offer(new int[]{0, x});
        dist[x] = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentDist = current[0];
            int currentNode = current[1];

            if (currentDist > dist[currentNode]) continue;

            for (int next : graph.get(currentNode)) {
                int cost = dist[currentNode] + 1;
                if (cost < dist[next]) {
                    dist[next] = cost;
                    queue.offer(new int[]{cost, next});
                }
            }
        }
    }
}
