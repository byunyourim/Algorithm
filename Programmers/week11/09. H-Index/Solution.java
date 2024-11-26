https://school.programmers.co.kr/learn/courses/30/lessons/42747

/*
* 논문 n편 중, h번 이상 인용된 논문이 h편이상이고, 나머지 논문이 h번 이하 인용되었을 때,
* h의 최댓값 구하기
*
* 과학자가 발표한 논문의 수는 1편 이상 1,000편 이하
* 논문별 인용 횟수는 0회 이상 10,000회 이하
* 
* 1. 정렬 
* 2. n 순회하면서 비교 citations의 길이만큼 반복 
*/

import java.util.Arrays;
class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);

        int n = citations.length;

        for (int i = 0; i < n; i++) {
            int h = n - i;  
            if (citations[i] >= h) return h;
        }
        return 0;
    }
}
