class Solution {
    private int count = 0;
    
    public int solution(int n) {
        int[] columns = new int[n];
        
        placeQueen(columns, 0, n);
        
        return count;
    }
    
    public void placeQueen(int[] columns, int row, int n) {
        if (row == n) {
            count++;
            return ;
        }
        
        for (int col = 0; col < n; col++) {
            if (isValid(columns, row, col)) {
                columns[row] = col;
                placeQueen(columns, row+1, n);
            }
        }
    }
    
    public boolean isValid(int[] columns, int row, int col) {
        for (int i = 0; i < row; i++) {   // 열 검사
            if (columns[i] == col || Math.abs(columns[i] - col) == Math.abs(Math.abs(i - row))) {
                return false;
            }
        }
        return true;
    }
}











