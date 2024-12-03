/*
https://school.programmers.co.kr/learn/courses/30/lessons/87946
*/

class Solution {
    public int answer; // 최대
    public boolean[] visited; // 방문여부
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];

        dfs(0, k, dungeons);

        return answer;
    }

    private void dfs(int depth, int k, int[][] dungeons) {
        for (int i=0; i< dungeons.length; i++) {
            if (!visited[i] && k >= dungeons[i][0]) {
                // 방문하지 않은 상태 && 현재피로도 > 최소피로도
                visited[i] = true;
                dfs(depth + 1, k-dungeons[i][1], dungeons); // 재귀
                visited[i] = false;
            }
        }
        answer = Math.max(answer, depth);
    }
}
