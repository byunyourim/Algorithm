package boj.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class boj1325_2 {
    static List<List<Integer>> graph;
    static boolean[] visited;
    static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   // 컴퓨터의 수
        int m = Integer.parseInt(st.nextToken());   // 연결 수

        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);  // a -> b
        }

        result = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            visited = new boolean[n + 1];
            dfs(i);
        }

        int max = Arrays.stream(result).max().getAsInt();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            if (max == result[i]) {
                builder.append(i + " ");
            }
        }
        System.out.println(builder.toString());
    }

    private static void dfs(int node) {
        visited[node] = true;
        for (int next : graph.get(node)) {
            if (!visited[next]) {
                dfs(next);
                result[next]++;
            }
        }
    }

}
