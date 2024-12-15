package boj.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 니모 찾기
 */
public class Boj10173 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        StringBuilder builder = new StringBuilder();
        while (!(str = br.readLine()).equals("EOI")) {
            if (str.toLowerCase().matches(".*(nemo).*")) {
                builder.append("Found\n");
            } else {
                builder.append("Missing\n");
            }
        }
        System.out.println(builder.toString());
    }
}
