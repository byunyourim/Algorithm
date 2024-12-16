package boj.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj14906 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder builder = new StringBuilder("SLURPYS OUTPUT\n");
        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            int lastIndexOfC = s.lastIndexOf('C');
            if (lastIndexOfC != -1) {
                if (isSlimp(s.substring(0, lastIndexOfC + 1))
                    && isSlump(s.substring(lastIndexOfC + 1))) {
                    builder.append("YES\n");
                } else {
                    builder.append("NO\n");
                }
            } else {
                if (s.startsWith("AH") && isSlump(s.substring(2))) {
                    builder.append("YES\n");
                } else {
                    builder.append("NO\n");
                }
            }
        }
        builder.append("END OF OUTPUT");
        System.out.println(builder.toString());
    }

    private static boolean isSlump(String s) {
        String regex = "^([DE]F+)+G$";
        return s.matches(regex);
    }

    private static boolean isSlimp(String s) {
        if (s.length() < 2) return false;
        if (s.length() == 2) return s.equals("AH");

        if (s.charAt(0) == 'A' && s.charAt(s.length() - 1) == 'C') {
            if (s.charAt(1) == 'B') {
                return isSlimp(s.substring(2, s.length() - 1));
            } else {
                return isSlump(s.substring(1, s.length() - 1));
            }
        }

        return false;
    }
}
