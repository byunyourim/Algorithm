// https://school.programmers.co.kr/learn/courses/30/lessons/42746

/**
* 0 또는 양의 정수가 주어질 때, 정수를 이어붙여 만들 수 있는 가장 큰 수 구하기.
*   
* numbers의 길이는 1 이상 100,000 이하이다.
* numbers의 원소는 0 이상 1,000 이하이다.
* 정답이 너무 클 수 있으니 문자열로 바꾸어 return 한다.
*
*
*  1. 정렬
*  2. 숫자를 이어붙인 후 비교
*  3. 문자열로 반환
*/

import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {

        String[] result = Arrays.stream(numbers)
            .mapToObj(String::valueOf)
            .sorted((a, b) -> (b + a).compareTo(a + b))
            .toArray(String[]::new);
        
        if (result[0].equals("0"))
            return "0";
        
        return String.join("", result);
    }
}
