import java.util.*;
/*
정점 : in : 0, out  : 2
도넛 : 정점 1, in : 1 , out : 1
막대 : in : 0, out : 1
8자 : 정점 1, in : 2, out : 2
*/
class Solution {
    Map<Integer, Integer> in = new HashMap<>();
    Map<Integer, Integer> out = new HashMap<>();
    public int[] solution(int[][] edges) {
        int[] answer = new int[4];
        
        for (int[] edge : edges) {
            out.put(edge[0], out.getOrDefault(edge[0], 0) + 1);
            in.put(edge[1], in.getOrDefault(edge[1], 0) + 1);
        }
        
        for (int node : out.keySet()) {
            if (out.get(node) >= 2) {
                if (!in.containsKey(node)) {
                    answer[0] = node;
                } else {
                    answer[3] += 1;
                }
            }
        }
        
        for (int i : in.keySet()) {
            if (!out.containsKey(i)) {
                answer[2] += 1;
            }
        }
        // 도넛
        answer[1] = out.get(answer[0]) - answer[2] - answer[3]; 
        return answer;
    }
}
