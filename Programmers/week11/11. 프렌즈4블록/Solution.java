// https://school.programmers.co.kr/learn/courses/30/lessons/17679

/*
* 지워지는 블록의 갯수 구하기
* 
* 1. 보드판 생성
* 2. 2x2인 블록 찾기
* 3. 블록 제거
* 4. 빈공간 채우기
* 5. 위 과정 반복
*
*
* 시간 복잡도 : O(k * m * n)
* -> 탐색 O(m * n)
* -> 제거 O(m * n)
* -> 공간 채우기 O(m * n) 
* -> 게임을 반복하는 횟수 O(k) * O(m * n) = O(k * m * n)
* 
* 공간 복잡도 : O(m * n)
* -> 제거할 블록 좌표 toRemove 배열 O(m * n) 
* -> 입력데이터를 담는 grid 배열 O(m * n)
*/ 
class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        
        char[][] grid = new char[m][n];
        for (int i = 0; i < m; i++) {
            grid[i] = board[i].toCharArray();
        }
        
        int totalRemoved = 0;
        
        while (true) {
            boolean[][] toRemove = new boolean[m][n];
            boolean found = false;
            
            for (int i = 0; i < m-1; i++) {
                for (int j = 0; j < n-1; j++) {
                    char block = grid[i][j];
                    if (block != ' ' &&
                        block == grid[i+1][j] &&
                        block == grid[i][j+1] &&
                        block == grid[i+1][j+1] ) {
                        
                        toRemove[i][j] = true;
                        toRemove[i+1][j] = true;
                        toRemove[i][j+1] = true;
                        toRemove[i+1][j+1] = true;
                        found = true;
                    }
                }
            }
            
            if (!found) break;
            
            int removed = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (toRemove[i][j]) {
                        grid[i][j] = ' ';
                        removed++;
                    }
                }
            }
            
            totalRemoved += removed;
            
            for (int j = 0; j < n; j++) {
                int emptyRow = m - 1;
                for (int i = m-1; i >= 0; i--) {
                    if (grid[i][j] != ' ') {
                        grid[emptyRow][j] = grid[i][j];
                        if (emptyRow != i) {
                            grid[i][j] = ' ';
                        }
                        emptyRow--;
                    }
                }
            }
        }
        
        return totalRemoved;
    }
}
