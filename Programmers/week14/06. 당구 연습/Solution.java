class Solution {
    public int[] solution(int m, int n, int startX, int startY, int[][] balls) {
        int[] answer = new int[balls.length];
        for (int i = 0; i < balls.length; i++) {
            int targetX = balls[i][0];
            int targetY = balls[i][1];

            int result = Integer.MAX_VALUE;

            // 오른쪽 반사
            if (!(startY == targetY && startX < targetX)) {
                result = Math.min(result, distance(startX, startY, 2 * m - targetX, targetY));
            }
            // 위쪽 반사
            if (!(startX == targetX && startY < targetY)) {
                result = Math.min(result, distance(startX, startY, targetX, 2 * n - targetY));
            }
            // 왼쪽 반사
            if (!(startY == targetY && startX > targetX)) {
                result = Math.min(result, distance(startX, startY, -targetX, targetY));
            }
            // 아래쪽 반사
            if (!(startX == targetX && startY > targetY)) {
                result = Math.min(result, distance(startX, startY, targetX, -targetY));
            }

            answer[i] = result;
        }

        return answer;
    }

    public int distance(int sx, int sy, int tx, int ty) {
        return (int) (Math.pow(sx - tx, 2) + Math.pow(sy - ty, 2));
    }
}
