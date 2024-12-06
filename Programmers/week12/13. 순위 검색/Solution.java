import java.util.*;
class Solution {
    public int[] solution(String[] infos, String[] query) {
        int[] result = new int[query.length];
        
        Map<String, List<Integer>> map = new HashMap<>();
        for (String info : infos) {
            String[] p = info.split(" ");
            String[] languages = {p[0], "-"};
            String[] jobs = {p[1], "-"};
            String[] exps = {p[2], "-"};
            String[] foods = {p[3], "-"};
            int score = Integer.parseInt(p[4]);
            
            for (String lang : languages) {
                for (String job : jobs) {
                    for (String exp : exps) {
                        for (String food : foods) {
                            String key = lang + job + exp + food;
                            map.putIfAbsent(key, new ArrayList<>());
                            map.get(key).add(score);
                        }
                    }
                }
            }
        }
        for (List<Integer> scores : map.values()) {
            Collections.sort(scores);
        }
        
        for (int i = 0; i < query.length; i++) {
            String[] conditions = query[i].replaceAll(" and", "").split(" ");
            String key = conditions[0] + conditions[1] + conditions[2] + conditions[3];
            
            int score = Integer.parseInt(conditions[4]);
            
            if (map.containsKey(key)) {
                List<Integer> scores = map.get(key);
                int idx = binarySearch(scores, score);
                
                result[i] = scores.size() - idx;
            } else {
                result[i] = 0;
            }
        }
        return result;
    }
    
    private int binarySearch (List<Integer> scores, int target) {
        int left = 0;
        int right = scores.size();
        while(left < right) {
            int mid = (left + right) / 2;
            if (scores.get(mid) >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
