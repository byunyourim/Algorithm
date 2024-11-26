// https://school.programmers.co.kr/learn/courses/30/lessons/42748

/**
* i ~ j 까지의 수를 자르고 정렬했을 대, k번째 수를 구하기
*
* 1. 수 자르기 substring()
* 2. 배열 정렬
* 3. K번째 수 찾기
*
* 시간복잡도
* 공간복잡도
*/

import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] res = new int[commands.length];
        
        int idx = 0;
        for (int[] command : commands) {
            int i = command[0];
            int j = command[1];
            int k = command[2];
            
            int[] arr = Arrays.copyOfRange(array, i-1,  j);
            Arrays.sort(arr);
            
            res[idx] = arr[k-1];
            idx++;
        }
        
        return res;
    }
}

