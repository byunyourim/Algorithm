package boj.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj11657 {
    static int n, m;
    static int[][] edges;
    static long[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        edges = new int[m][3];
        dist = new long[n + 1];
        Arrays.fill(dist, Long.MAX_VALUE);

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            edges[i] = new int[] {a, b, c};
        }

        if (bellmanFord(1)) {
            System.out.println(-1);
        } else {
            for (int i = 2; i <= n; i++) {
                System.out.println(dist[i] == Long.MAX_VALUE ? -1 : dist[i]);
            }
        }
    }

    private static boolean bellmanFord(int s) {
        dist[s] = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                int w = edge[2];

                if (dist[u] != Long.MAX_VALUE && dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                }
            }
        }

        // 음수 사이클 확인
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            if (dist[u] != Long.MAX_VALUE && dist[u] + w < dist[v]) {
                return true;
            }
        }
        return false;
    }
}
