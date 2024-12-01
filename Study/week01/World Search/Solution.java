/*
1. 보드의 각 칸에서 상하좌우로 단어찾기, 백트래킹
2. 찾은 단어 set에 저장

- 시간
  - 보드 탐색 O(m * n)
  - 단어 갯수만큼 탐색 O(K)
  - 각 단어에 대해 최대 4^L 탐색
  - O(k * m * n * 4^l) -> 시간 통과 못함
- 공간 
  - 재귀호출 : 최대 O(L)
  - visited : visited(m * n)
*/

class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        Set<String> result = new HashSet<>();
        int rows = board.length;
        int cols = board[0].length;

        for (String word : words) {
            boolean found = false;
            boolean[][] visited = new boolean[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (backtracking(board, word, 0, i, j, visited)) {
                        result.add(word);
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }
        }
        return new ArrayList<>(result);
    }

    private boolean backtracking(char[][] board, String word, int index, 
        int row, int col, boolean[][] visited) {
        
        if (index == word.length()) return true;

        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || visited[row][col]) {
            return false;
        }

        if (board[row][col] != word.charAt(index)) {
            return false;
        }

        visited[row][col] = true;
    
        boolean found = backtracking(board, word, index + 1, row + 1, col, visited) ||
                        backtracking(board, word, index + 1, row - 1, col, visited) ||
                        backtracking(board, word, index + 1, row, col + 1, visited) ||
                        backtracking(board, word, index + 1, row, col - 1, visited);

        visited[row][col] = false;

        return found;
    
    }
}
