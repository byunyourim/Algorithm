package boj.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 잠수함
 * 잠수함 엔진소리인지 확인 후 맞다면 SUBMARINE, 아닌 경우 NOISE
 */
public class Boj2671 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        if (input.matches("^(100+1+|01)+$")) {
            System.out.println("SUBMARINE");
        } else {
            System.out.println("NOISE");
        }
    }
}
