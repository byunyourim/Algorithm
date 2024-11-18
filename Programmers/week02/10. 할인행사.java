// https://school.programmers.co.kr/learn/courses/30/lessons/131127
import java.util.HashMap;
import java.util.Map;

/*
 슬라이딩 윈도우로 10씩 검사한다.
*/
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        int res = 0;

        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> currentMap = new HashMap<>(wantMap);

            for (int j = i; j < i + 10; j++) {
                String item = discount[j];
                if (currentMap.containsKey(item)) {
                    currentMap.put(item, currentMap.get(item) - 1);
                    if (currentMap.get(item) == 0) {
                        currentMap.remove(item);
                    }
                }
            }
            if (currentMap.isEmpty()) {
                res++;
            }
        }
        return res;
    }
}
