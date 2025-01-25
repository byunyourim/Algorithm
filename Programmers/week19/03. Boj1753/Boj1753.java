package boj.graph;

import java.io.*;
import java.util.*;

public class Boj1753 {
    static List<List<int[]>> graph = new ArrayList<>();
    static int[] dist;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        int s = Integer.parseInt(br.readLine());

        dist = new int[V + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        for (int i = 0; i <= V; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            graph.get(u).add(new int[]{v, w});
        }

        dijkstra(s);

        for (int i = 1; i <= V; i++) {
            System.out.println(dist[i] == Integer.MAX_VALUE ? "INF" : dist[i]);
        }


    }

    private static void dijkstra(int s) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{s, 0});

        dist[s] = 0;

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int currentNode = current[0];
            int currentWeight = current[1];

            if (currentWeight > dist[currentNode]) continue;

            for (int[] next : graph.get(currentNode)) {
                int nextNode = next[0];
                int nextWeight = next[1];

                if (dist[nextNode] > nextWeight + currentWeight) {
                    dist[nextNode] = nextWeight + currentWeight;

                    pq.offer(new int[] {nextNode, dist[nextNode]});
                }


            }
        }
    }

}
