import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class 효율적인해킹 {
    static int[] result;
    static List<List<Integer>> graph;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   // 컴퓨터의 수
        int m = Integer.parseInt(st.nextToken());   // 연결 수

        result = new int[n + 1];

        graph = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }

        // a -> b
        // 많은 컴퓨터가 연결된 컴 찾기
       for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(b).add(a);
        }

        for (int i = 1; i <= n; i++) {
            visited = new boolean[n + 1];
            bfs(i, visited);
        }

        int max = Arrays.stream(result).max().getAsInt();

        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < n + 1; i++) {
            if (result[i] == max) {
                builder.append(i).append(" ");
            }
        }

        System.out.println(builder.toString().trim());

    }

    private static void bfs(int start, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while(!queue.isEmpty()) {
            int current = queue.poll();
            for (int next : graph.get(current)) {
                if (visited[next]) continue;
                visited[next] = true;
                result[start]++;
                queue.add(next);
            }
        }

    }
}
