// https://school.programmers.co.kr/learn/courses/30/lessons/131701
import java.util.HashSet;
import java.util.Set;
class Solution {
    public int solution(int[] elements) {
        /**
         * 1 ~ 5 까지 묶음 가능
         * for (1~n) {}
         *
         * 배열에 넣기, 중복 제외, 오름차순
         * 총 갯수
         */
        Set<Integer> resultList = new HashSet<>();
        int n = elements.length;

        int[] extendedArr = new int[n * 2];
        for (int i=0; i<n; i++) {
            extendedArr[i] = elements[i];
            extendedArr[i + n] = elements[i];
        }

        // 몇 개씩 묶을 것인가? 1~5
        // 0부터 시작하는 경우 01, 12, 23, 34, 45
        for (int len=1; len<=n; len++) {
            for (int start=0; start<n; start++) {
                int sum = 0;
                for (int i=0; i<len; i++) {
                    sum += extendedArr[start + i];
                }
                resultList.add(sum);
            }
        }
        return resultList.size();
    }
}
