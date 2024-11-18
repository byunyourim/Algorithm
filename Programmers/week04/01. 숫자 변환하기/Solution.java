class Solution{
    public int solution(int x, int y, int n) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[y + 1];

        queue.add(new int[]{x, 0});
        visited[x] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int curValue = current[0];
            int curCount = current[1];

            if (curValue == y) {
                return curCount;
            }

            int[] nextValues = new int[]{curValue + n, curValue * 2, curValue * 3};
            for (int nextValue : nextValues) {
                if (nextValue <= y && !visited[nextValue]) {
                    visited[nextValue] = true;
                    queue.add(new int[]{nextValue, curCount + 1});
                }
            }
        }

        return -1;
    }
}
