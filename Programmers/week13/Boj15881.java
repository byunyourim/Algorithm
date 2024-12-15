package boj.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * pPAp 패턴의 개수 찾기
 */
public class Boj15881 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String p = "pPAp";

        Pattern pattern = Pattern.compile(p);
        Matcher matcher = pattern.matcher(s);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        System.out.println(count);
    }

}
