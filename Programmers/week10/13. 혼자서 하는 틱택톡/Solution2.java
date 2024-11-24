class Solution {
    public int solution(String[] board) {
        int oCount = 0, xCount = 0;

        String[][] arr = new String[3][3];
        for (int i = 0; i < 3; i++) {
            arr[i] = board[i].split("");
            for (String cell : arr[i]) {
                if (cell.equals("O")) oCount++;
                else if (cell.equals("X")) xCount++;
            }
        }

        if (oCount < xCount || oCount > xCount + 1) return 0;

        int oWin = checkWin(arr, "O");
        int xWin = checkWin(arr, "X");

        if (oWin > 0 && xWin > 0) return 0; // O와 X가 동시에 승리할 수 없음
        if (oWin > 0 && oCount != xCount + 1) return 0; // O가 승리하면 O의 개수는 X보다 1 많아야 함
        if (xWin > 0 && oCount != xCount) return 0; // X가 승리하면 O와 X의 개수가 같아야 함

        return 1;
    }

    private int checkWin(String[][] arr, String player) {
        int winCount = 0;

        for (int i = 0; i < 3; i++) {
            if (arr[i][0].equals(player) && arr[i][1].equals(player) && arr[i][2].equals(player)) winCount++;
            if (arr[0][i].equals(player) && arr[1][i].equals(player) && arr[2][i].equals(player)) winCount++;
        }

        if (arr[0][0].equals(player) && arr[1][1].equals(player) && arr[2][2].equals(player)) winCount++;
        if (arr[0][2].equals(player) && arr[1][1].equals(player) && arr[2][0].equals(player)) winCount++;

        return winCount;
    }
}
