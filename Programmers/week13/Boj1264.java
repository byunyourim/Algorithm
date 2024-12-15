package boj.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 모음의 개수 세기
 */
public class Boj1264 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        Pattern pattern = Pattern.compile("[aeiou]");
        while (!(str = br.readLine()).equals("#")) {
            Matcher matcher = pattern.matcher(str.toLowerCase());
            int count = 0;
            while (matcher.find()) {
                count++;
            }
            System.out.println(count);
        }
    }
}
