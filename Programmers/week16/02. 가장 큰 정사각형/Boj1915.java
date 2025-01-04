package boj.dp;

import java.io.*;
import java.util.*;

public class Boj1915 {
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++){
                arr[i][j] = s.charAt(j) - '0';
            }
        }

        int max = 0;
        // 최대 정사각형 크기 계산
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++){
                if (arr[i][j] == 1 && i > 0 && j > 0) {
                    arr[i][j] = Math.min(Math.min(arr[i-1][j], arr[i][j-1]), arr[i-1][j-1]) + 1;
                }
                max = Math.max(max, arr[i][j]);

            }
        }

        System.out.println(max * max);

    }
}
