import java.util.*;
class Solution {
    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        
        for (int i = 0; i < places.length; i++) {
            answer[i] = checkRoom(places[i]) ? 1 : 0;
        } 
        return answer;
    }
    
    public boolean checkRoom(String[] room) {
        // 학생 위치 구하기
        List<int[]> people = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int cur = room[i].charAt(j);
                if (cur == 'P') {
                    people.add(new int[]{i, j});   // 행, 열?
                }
            }
        }
        
        // 거리 구하기
        for (int i = 0; i < people.size(); i++) {
            for (int j = i + 1; j < people.size(); j++) {
                int[] p1 = people.get(i);
                int[] p2 = people.get(j);
                
                int distance  = Math.abs(p1[0]-p2[0]) + Math.abs(p1[1] - p2[1]);
                
                if (distance <= 2){
                    if (p1[0] == p2[0]) {  // 같은 행
                    if (room[p1[0]].charAt((p1[1] + p2[1]) / 2) != 'X') {
                        return false;
                    }
                    } else if (p1[1] == p2[1]) {  // 같은 열
                        if (room[(p1[0] + p2[0]) / 2].charAt(p1[1]) != 'X') {
                            return false;
                        }
                    } else {  // 대각선
                        if (room[p1[0]].charAt(p2[1]) != 'X' || room[p2[0]].charAt(p1[1]) != 'X') {
                            return false;
                        }
                    }
                }
                
            }
        }
        return true;
    }
}
