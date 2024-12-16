package boj.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1013 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            if (str.matches("^(100+1+|01)+$")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
