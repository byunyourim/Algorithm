import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Set<String> userSet = new HashSet<>();
        Map<String, Set<String>> blackMap = new HashMap<>();
        List<String> blackList = new ArrayList<>();
        for (int i = 0; i < report.length; i++) {
            String userId = report[i].split(" ")[0];
            String blackId = report[i].split(" ")[1];
            
            blackMap.putIfAbsent(blackId, new HashSet<>());
            blackMap.get(blackId).add(userId);
        }
        
        List<Map.Entry<String, Set<String>>> result = blackMap.entrySet()
            .stream()
            .filter(entry -> entry.getValue().size() >= k)
            .collect(Collectors.toList());
        
        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            int cnt = 0;
            for (Map.Entry<String, Set<String>> entry : result) {
                if (entry.getValue().contains(id_list[i])) {
                    cnt++;
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }
}
