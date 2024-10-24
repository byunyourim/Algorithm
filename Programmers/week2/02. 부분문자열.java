import java.util.HashSet;
import java.util.Set;

/**
 * 문자열 s가 주어졌을 때, 반복되는 문자가 없는 가장 긴 부분문자열을 찾으시오
 *
 * 예제 1:
 * 입력: s = “abcabcbb”
 * 출력: 3
 * 설명: 반복되는 문자가 없는 가장 긴 부분 문자열은 길이가 3인 “abc” 입니다.
 *
 * 예제 2:
 * 입력: s = “pwwkew”
 * 출력: 3
 *
 */

public class LengthOfLongestSubstringExample {
    public static void main(String[] args) {
        String s = "pwwkew";
        LengthOfLongestSubstring solution = new LengthOfLongestSubstring();
        int res = solution.lengthOfLongestSubstring(s);
        System.out.println(res);
    }
}

class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;

        Set<Character> dataSet = new HashSet<>();
        int left = 0;
        int max = 1;
        for (int right=0; right<s.length(); right++) {
            char currentChar = s.charAt(right);

            while (dataSet.contains(currentChar)) {
                dataSet.remove(s.charAt(left));
                left++;
            }
            dataSet.add(currentChar);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
