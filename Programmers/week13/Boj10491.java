package boj.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj10491 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        while((str = br.readLine()) != null) {
            str = str.toLowerCase();
            if (str.matches(".*(problem).*")) {
                System.out.println("yes");

            } else {
                System.out.println("no");
            }
        }
    }
}
