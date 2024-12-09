package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*

# 필요한 배추벌레 구하기

# 풀이 과정
1. 인접한 배추의 그룹을 확인한다.
2. 그룹의 수 구하기

# 시간복잡도
- t개의 테스트와, 각 테스트 케이스마다 k개의 배추 위치를 받는다. O(t * k)
- bfs에서 최대 n * m 번 칸을 방문한다. O(n * m)
- O(t * (n * m))


# 공간복잡도
- 배추밭을 표시한 map의 공간 O(n * m)
- 방문배열 O(n * m)
- 큐 최대 크기 O(n * m)
- O(n * m)

 */
public class 유기농배추 {
    static boolean[][] visited;
    static int[][] map;
    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};
    static int m, n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());   // 배추밭 가로 길이
            n = Integer.parseInt(st.nextToken());   // 배추밭 세로 길이
            int k = Integer.parseInt(st.nextToken());   // 배추 위치의 개수

            map = new int[n][m];
            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());   // x
                int b = Integer.parseInt(st.nextToken());   // y
                map[b][a] = 1;
            }

            int count = 0;
            visited = new boolean[n][m];
            for (int col = 0; col < n; col++) {
                for (int row = 0; row < m;row++) {
                    if (map[col][row] == 1 && !visited[col][row]) {
                        bfs(col, row);
                        count++;
                    }
                }
            }
            builder.append(count).append("\n");
        }
        System.out.println(builder.toString());
    }

    private static void bfs(int col, int row) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {col, row});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[1];
            int y = current[0];

            for (int i = 0; i < 4; i++) {
                int mx = x + dx[i];
                int my = y + dy[i];

                if (mx >= 0 && mx < m && my >= 0 && my < n
                    && !visited[my][mx] && map[my][mx] == 1) {
                    queue.add(new int[] {my, mx});
                    visited[my][mx] = true;
                }

            }
        }
    }
}
