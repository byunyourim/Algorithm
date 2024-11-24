class Solution {
    public int solution(String[] board) {
        String[][] arr = new String[3][3];
        int oCount = 0;
        int xCount = 0;

        for (int i = 0; i < 3; i++) {
            String[] el = board[i].split("");
            for (int j = 0; j < 3; j++) {
                arr[i][j] = el[j];
                if (el[j].equals("O")) oCount++;
                else if (el[j].equals("X")) xCount++;
            }
        }

        if (oCount < xCount || oCount > xCount + 1) return 0;

        int oWin = 0;
        int xWin = 0;

        for (int i = 0; i < 3; i++) {
            if (arr[i][0].equals(arr[i][1]) && arr[i][1].equals(arr[i][2])) {
                if (arr[i][0].equals("O")) oWin++;
                if (arr[i][0].equals("X")) xWin++;
            }
            if (arr[0][i].equals(arr[1][i]) && arr[1][i].equals(arr[2][i])) {
                if (arr[0][i].equals("O")) oWin++;
                if (arr[0][i].equals("X")) xWin++;
            }
        }

        if (arr[0][0].equals(arr[1][1]) && arr[1][1].equals(arr[2][2])) {
            if (arr[0][0].equals("O")) oWin++;
            if (arr[0][0].equals("X")) xWin++;
        }
        if (arr[0][2].equals(arr[1][1]) && arr[1][1].equals(arr[2][0])) {
            if (arr[0][2].equals("O")) oWin++;
            if (arr[0][2].equals("X")) xWin++;
        }

        if (oWin > 0 && xWin > 0) return 0;

        if (oWin > 0 && oCount != xCount + 1) return 0;

        if (xWin > 0 && oCount != xCount) return 0;

        return 1;
    }
}
