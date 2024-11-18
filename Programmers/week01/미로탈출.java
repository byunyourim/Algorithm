/**
 * start -> lever 의 최단 거리
 * lever -> exit 의 최단 거리
 * 
 */
class Solution_미로탈출 {
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    private static String[][] miro;

    public int solution(String [] maps) {
        miro = new String[maps.length][maps[0].length()];

        int[] start = new int[2];
        int[] lever = new int[2];

        for (int i=0; i<maps.length; i++) {
            String[] val = maps[i].split("");

            for (int j=0; j<maps[0].length(); j++) {
                miro[i][j] = val[j];
                if (miro[i][j].equals("S")) start = new int[]{i, j};
                if (miro[i][j].equals("L")) lever = new int[] {i, j};
            }
        }

        int cnt1 = bfs(start, "L");
        int cnt2 = bfs(lever, "E");

        if (cnt1 == -1 || cnt2 == -1) return -1;

        return cnt1 + cnt2;
    }

    private int bfs(int[] start, String end) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start[0], start[1], 0});

        boolean[][] visited = new boolean[miro.length][miro[0].length];

        while (!queue.isEmpty()) {
            int[] passage = queue.poll();
            int x = passage[0];
            int y = passage[1];
            int count = passage[2];

            visited[x][y] = true;

            if (miro[x][y].equals(end)) return count;

            for (int i=0; i<4; i++) {
                int mx = x + dx[i];
                int my = y + dy[i];

                if (mx>=0 && mx<miro.length && my>=0 && my<miro[0].length && !visited[mx][my]) {

                    if (miro[mx][my].equals("X")) continue;

                    visited[mx][my] = true;
                    queue.add(new int[]{mx, my, count+1});
                }

            }
        }
        return -1;
    }
}
