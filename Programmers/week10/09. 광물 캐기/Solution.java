import java.util.*;

class Solution {
    public int solution(int[] picks, String[] minerals) {
        int[][] stress = {
            {1, 1, 1},   // 다이아 곡괭이
            {5, 1, 1},   // 철 곡괭이
            {25, 5, 1}   // 돌 곡괭이
        };
        
        int maxpicks = (picks[0] + picks[1] + picks[2]) * 5;

        List<int[]> mineralGroups = new ArrayList<>();
        for (int i = 0; i < Math.min(minerals.length, maxpicks); i += 5) {
            int[] group = new int[3]; 
            for (int j = i; j < Math.min(i + 5, minerals.length); j++) {
                if (minerals[j].equals("diamond")) group[0]++;
                else if (minerals[j].equals("iron")) group[1]++;
                else group[2]++;
            }
            mineralGroups.add(group);
        }
        
        mineralGroups.sort((a, b) -> {
            int aFatigue = 25 * a[0] + 5 * a[1] + a[2];
            int bFatigue = 25 * b[0] + 5 * b[1] + b[2];
            return bFatigue - aFatigue;
        });
        
        int stressScore = 0;
        for (int[] group : mineralGroups) {
            int pick = -1;

            for (int i = 0; i < 3; i++) {
                if (picks[i] > 0) {
                    pick = i;
                    picks[i]--;
                    break;
                }
            }
            if (pick == -1) break; 

            for (int j = 0; j < 3; j++) {
                stressScore += stress[pick][j] * group[j];
            }
        }
            
        
        return stressScore;
    }
}
